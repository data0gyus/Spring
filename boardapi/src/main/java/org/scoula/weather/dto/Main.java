package org.scoula.weather.dto;

import lombok.Data;

@Data
public class Main{
	private Object temp;
	private Object temp_min;
	private int grndLevel;
	private int humidity;
	private int pressure;
	private int seaLevel;
	private Object feels_like;
	private Object temp_max;
}