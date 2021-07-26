package com.thirumal.rest.locz.LocalizationApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thirumal.rest.locz.LocalizationApi.model.LanguageDATA;

@RestController
public class HomeController {

	@Autowired
	private LangdataService langdataservice;

	@RequestMapping(method = RequestMethod.GET, path = "hello")
	public LanguageDATA getLangData() {
		return langdataservice.getAllData();
	}

	@PostMapping("insert/{data}")
	public LanguageDATA insertData(@PathVariable String data) {

		return langdataservice.insertData(data);
	}

}
