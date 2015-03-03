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
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    @SerializedName("save")
    @Expose
    public String save;

    @SerializedName("id")
    @Expose
    public String id;

    public BaseOptions(String sourceCode, SupportedLanguages language){
        this.sourceCode = sourceCode;
        this.language = language;
    }

    public String getCallback() {
        if (this.callback == null){
            return "";
        }
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getCompressed() {
        if(this.compressed == null){
            return "1";
        }
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

        if(this.async == null){
            return "0";
        }
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

    public SupportedLanguages getLanguage() {
        return language;
    }

    public String getJson(){
        Gson gson = new Gson();
        return gson.toJson(this, this.getClass());
    }

    public String getSave() {
        if(this.save == null){
            return "1";
        }
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<NameValuePair> getURLParameters(){
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        parameters.add(new BasicNameValuePair("source", getSourceCode()));
        parameters.add(new BasicNameValuePair("lang", getLanguage().getValue()));
        parameters.add(new BasicNameValuePair("client_secret", getClientSecret()));
        parameters.add(new BasicNameValuePair("async", getAsync()));
        parameters.add(new BasicNameValuePair("callback", getCallback()));
        parameters.add(new BasicNameValuePair("save", getSave()));
        if(id != null) {
            parameters.add(new BasicNameValuePair("id", id));
        }
        parameters.add(new BasicNameValuePair("compressed", getCompressed()));

        return parameters;
    }
}