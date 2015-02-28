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

import com.hackerearth.heapi.sdk.responses.RunResponse;
import org.junit.Assert;
import org.junit.Test;

public class TestCompile {

    private final String clientSecret =  "f6c5dceeb3df56b32ab42e70da8584dff13dc744";

    private final String testSource = "#include <stdio.h>" +
            "int main(){" +
            "printf('HelloWorld');" +
            "return 0;" +
            "}";

    @Test
    public void TestOptions(){
        CompileOptions options = new CompileOptions(testSource, SupportedLanguages.CPP);
        String jsonOptions = options.getJson();
        Assert.assertNotNull(jsonOptions);
    }

    @Test
    public void TestRequest(){
        HackerEarthAPI apiHandle  = new HackerEarthAPI(clientSecret);
        RunOptions options = new RunOptions(testSource, SupportedLanguages.CPP);
        RunResponse response = apiHandle.Run(options);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getMessage());
        System.out.print(response.getMessage());
    }
}
