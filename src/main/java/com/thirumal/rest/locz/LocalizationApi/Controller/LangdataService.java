package com.thirumal.rest.locz.LocalizationApi.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thirumal.rest.locz.LocalizationApi.model.LangModel;
import com.thirumal.rest.locz.LocalizationApi.model.LanguageDATA;

@Service
public class LangdataService {
	public static LanguageDATA data = new LanguageDATA();

	public static List<LangModel> engData = new ArrayList<LangModel>();
	public static List<LangModel> tamilData = new ArrayList<LangModel>();

	static {
		engData.add(new LangModel("data"));
		tamilData.add(new LangModel("atad"));
		engData.add(new LangModel("hello"));
		tamilData.add(new LangModel("olleh"));
		data.setEn(engData);
		data.setTn(tamilData);
	}

	public LanguageDATA getAllData() {
		return data;
	}

	public LanguageDATA insertData(String data) {

		StringBuilder input = new StringBuilder(data);

		engData.add(new LangModel(data));
		tamilData.add(new LangModel(input.reverse().toString()));

		return this.data;
	}
}
