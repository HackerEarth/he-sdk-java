/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 HackerEarth
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:*
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.*
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.hackerearth.heapi.sdk;
import com.google.gson.Gson;
import com.hackerearth.heapi.sdk.client.HackerEarthAPI;
import com.hackerearth.heapi.sdk.options.CompileOptions;
import com.hackerearth.heapi.sdk.options.RunOptions;
import com.hackerearth.heapi.sdk.options.SupportedLanguages;

import com.hackerearth.heapi.sdk.responses.CompileResponse;
import com.hackerearth.heapi.sdk.responses.RunResponse;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestCompile {

    private final String clientSecret = "f6c5dceeb3df56b32ab42e70da8584dff13dc744";

    private final String testSource = getStringResource("/helloworld.cpp");

    @Test
    public void TestOptions() {
        Assert.assertNotNull(testSource);
        CompileOptions options = new CompileOptions(testSource, SupportedLanguages.CPP);
        String jsonOptions = options.getJson();
        Assert.assertNotNull(jsonOptions);
    }

    @Test
    public void TestRunRequest() {
        Assert.assertNotNull(testSource);
        HackerEarthAPI apiHandle = new HackerEarthAPI(clientSecret);
        RunOptions options = new RunOptions(testSource, SupportedLanguages.CPP);
        RunResponse response = apiHandle.Run(options);
        Assert.assertNotNull(response);
        Gson gson = new Gson();
        System.out.println(gson.toJson(response, RunResponse.class));
    }

    /*
    *
    * Takes filename as input and returns file Contents as String.
    * @param FileName String
    * @return String file contents
    *
    */
    private String getStringResource(String fileName) {
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(
                    getClass().getResourceAsStream(fileName)));
            StringBuffer resultBuffer = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                resultBuffer.append(line);
                resultBuffer.append("\n");
            }
            String str = resultBuffer.toString();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Test
    public void TestCompileRequest(){
        Assert.assertNotNull(testSource);
        HackerEarthAPI apiHandle = new HackerEarthAPI(clientSecret);
        CompileOptions options = new CompileOptions(testSource, SupportedLanguages.CPP);
        CompileResponse response = apiHandle.Compile(options);
        Assert.assertNotNull(response);
        Gson gson = new Gson();
        System.out.println(gson.toJson(response, CompileResponse.class));
    }
}