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
package com.hackerearth.heapi.sdk.options;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.List;

public class RunOptions extends CompileOptions {


    public static final String RUN_TIME_UPPER_LIMIT = "5";

    public static final String MEMORY_UPPER_LIMIT = "262144";
    @SerializedName("compiled")
    @Expose
    public String compiled;

    @SerializedName("time_limit")
    @Expose
    public String timeLimit;

    @SerializedName("memory_limit")
    @Expose
    public String memoryLimit;

    @SerializedName("html")
    @Expose
    public String html;

    public int save = 1;

    public RunOptions(String sourceCode, SupportedLanguages Language){
        super(sourceCode, Language);
    }

    public String getTimeLimit() {
        if(timeLimit == null){
            return RUN_TIME_UPPER_LIMIT;
        }
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getCompiled() {
        if(compiled == null){
            return "0";
        }
        return compiled;
    }

    public void setCompiled(String compiled) {
        this.compiled = compiled;
    }

    public String getMemoryLimit() {
        if(memoryLimit == null){
            return MEMORY_UPPER_LIMIT;
        }
        return memoryLimit;
    }

    public void setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public String getHtml() {
        if(html == null){
            return "0";
        }
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    @Override
    public List<NameValuePair> getURLParameters(){
        List<NameValuePair> parameters = super.getURLParameters();
        parameters.add(new BasicNameValuePair("html", getHtml()));
        parameters.add(new BasicNameValuePair("compiled", getCompiled()));
        parameters.add(new BasicNameValuePair("memory_limit", getMemoryLimit()));
        parameters.add(new BasicNameValuePair("time_limit", getTimeLimit()));
        return parameters;
    }

}
