package com.afrias.ceshopcourses.ProgressControllerTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.assertj.core.api.Assertions;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import com.afrias.ceshopcourses.ApplicationConfig;

@SpringBootTest
@AutoConfigureMockMvc
@Import(ApplicationConfig.class)
public class ProgressControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void shouldFetchAllStudents() throws Exception {
		this.mockMvc.perform(get("/api/students")).andExpect(status().isOk())
			.andExpect(jsonPath("$[0].id", Is.is(1))).andExpect(jsonPath("$[0].firstName", Is.is("Andres"))).andExpect(jsonPath("$[0].lastName", Is.is("Frias")))
			.andExpect(jsonPath("$[1].id", Is.is(2))).andExpect(jsonPath("$[1].firstName", Is.is("Sammy"))).andExpect(jsonPath("$[1].lastName", Is.is("Sossa")))
			.andExpect(jsonPath("$[2].id", Is.is(3))).andExpect(jsonPath("$[2].firstName", Is.is("Daniel"))).andExpect(jsonPath("$[2].lastName", Is.is("Estevez")))
			.andExpect(jsonPath("$[3].id", Is.is(4))).andExpect(jsonPath("$[3].firstName", Is.is("Santiago"))).andExpect(jsonPath("$[3].lastName", Is.is("Aponte")));
	}
	
	@Test
	void shouldFetctAllCourses() throws Exception {
		this.mockMvc.perform(get("/api/courses")).andExpect(status().isOk())
			.andExpect(jsonPath("$", IsNot.not(IsNull.nullValue())))
			.andExpect(result -> Assertions.assertThat(
					result.getResponse().getContentAsString())
					.contains("{\"id\":1,\"name\":\"Python Advanced\",\"totalQuestions\":20}"));
	}
	
	@Test
	void shouldGetDataByStudentIdAndCourseId() throws Exception {
		long studentId = 1L;
		long courseId = 5L;
		this.mockMvc.perform(get("/api/progress/{studentId}/{couserId}", studentId, courseId)).andExpect(status().isOk())
			.andExpect(jsonPath("$", IsNot.not(IsNull.nullValue())))
			.andExpect(result -> Assertions.assertThat(
					result.getResponse().getContentAsString())
					.contains("{\"data\":{\"id\":5,\"completedQuestions\":52,\"student\":{\"id\":1,\"firstName\":\"Andres\",\"lastName\":\"Frias\"},\"course\":{\"id\":5,\"name\":\"Flutter Web\",\"totalQuestions\":55},\"percentageCompleted\":94.54545454545455}}"));

	}
	
	@Test
	void shouldGetErrorWhenStudentIdAndCourseIdNotFound() throws Exception {
		long studentId = 1L;
		long courseId = 8L;
		this.mockMvc.perform(get("/api/progress/{studentId}/{couserId}", studentId, courseId))
			.andExpect(status().isNotFound());
	}
	
	@Test
	void shouldGetDataByStudentId() throws Exception {
		long studentId = 2L;
		this.mockMvc.perform(get("/api/progress/{studentId}", studentId)).andExpect(status().isOk())
			.andExpect(jsonPath("$", IsNot.not(IsNull.nullValue())))
			.andExpect(result -> Assertions.assertThat(
					result.getResponse().getContentAsString())
					.contains("{\"data\":[{\"id\":3,\"completedQuestions\":55,\"student\":{\"id\":2,\"firstName\":\"Sammy\",\"lastName\":\"Sossa\"},\"course\":{\"id\":3,\"name\":\"Problem solving skills\",\"totalQuestions\":70},\"percentageCompleted\":78.57142857142857}]}"));

	}
	
	@Test
	void shouldGetErrorWhenStudentIdNotFound() throws Exception {
		long studentId = 10L;
		this.mockMvc.perform(get("/api/progress/{studentId}", studentId))
			.andExpect(status().isNotFound());
	}

}
