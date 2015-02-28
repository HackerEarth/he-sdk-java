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

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseOptions {

    @SerializedName("source")
    @Expose
    public final String sourceCode;

    @SerializedName("lang")
    @Expose
    public SupportedLanguages language;

    @SerializedName("client_secret")
    @Expose
    public String clientSecret;

    @SerializedName("callback")
    @Expose
    public String callback;

    @SerializedName("compressed")
    @Expose
    public String compressed;

    @SerializedName("async")
    @Expose
    public String async;

    public BaseOptions(String sourceCode, SupportedLanguages language){
        this.sourceCode = sourceCode;
        this.language = language;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getCompressed() {
        return compressed;
    }

    public void setCompressed(String compressed) {
        this.compressed = compressed;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public String getSourceCode() {
        return sourceCode;

    }

    public void setLanguage(SupportedLanguages language) {
        this.language = language;
    }

    protected String getParams(){
        Gson gson = new Gson();
        String json_text = gson.toJson(this);
        return json_text;

    }

    public SupportedLanguages getLanguage() {
        return language;
    }

    public String getJson(){
        Gson gson = new Gson();
        return gson.toJson(this, this.getClass());
    }

}