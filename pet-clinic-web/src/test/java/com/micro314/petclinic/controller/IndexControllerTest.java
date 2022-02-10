package com.micro314.petclinic.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.net.URI;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class IndexControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void whenGetIndex_shouldReturnStatusOk() throws Exception {
        this.mockMvc.perform(get("/index")).andExpect(status().isOk());
    }

    @Test
    public void whenGetIndexDotHtml_shouldReturnStatusOk() throws Exception {
        this.mockMvc.perform(get("/index.html")).andExpect(status().isOk());
    }

    @Test
    public void whenGetIndex_shouldContainIndexTitle() throws Exception {
        this.mockMvc.perform(get("/index")).andExpect(content().string(containsString("<title>Pet Clinic - Index</title>")));
    }

    @Test
    public void whenGetEmpty_andGetSlash_andGetIndex_andGetIndexDotHtml__allReturnSameString() throws Exception {
        MvcResult emptyUrlResult = this.mockMvc.perform(get(URI.create(""))).andReturn();
        MvcResult slashUrlResult = this.mockMvc.perform(get("/")).andReturn();
        MvcResult indexUrlResult = this.mockMvc.perform(get("/index")).andReturn();
        MvcResult indexDotHtmlResult = this.mockMvc.perform(get("/index.html")).andReturn();

        assertThat(emptyUrlResult.getResponse().getContentAsString()).isEqualTo(slashUrlResult.getResponse().getContentAsString());
        assertThat(slashUrlResult.getResponse().getContentAsString()).isEqualTo(indexUrlResult.getResponse().getContentAsString());
        assertThat(indexUrlResult.getResponse().getContentAsString()).isEqualTo(indexDotHtmlResult.getResponse().getContentAsString());
    }
}
