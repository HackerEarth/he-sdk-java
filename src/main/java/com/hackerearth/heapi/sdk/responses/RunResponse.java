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
package com.hackerearth.heapi.sdk.responses;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class RunResponse extends BaseResponse{

    @Expose
    private Errors errors;
    @Expose
    private String id;
    @SerializedName("code_id")
    @Expose
    private String codeId;
    @Expose
    private String message;
    @SerializedName("compile_status")
    @Expose
    private String compileStatus;
    @SerializedName("run_status")
    @Expose
    private RunStatus runStatus;
    @SerializedName("web_link")
    @Expose
    private String webLink;

    /**
     *
     * @return
     * The errors
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     *
     * @param errors
     * The errors
     */
    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The codeId
     */
    public String getCodeId() {
        return codeId;
    }

    /**
     *
     * @param codeId
     * The code_id
     */
    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The compileStatus
     */
    public String getCompileStatus() {
        return compileStatus;
    }

    /**
     *
     * @param compileStatus
     * The compile_status
     */
    public void setCompileStatus(String compileStatus) {
        this.compileStatus = compileStatus;
    }

    /**
     *
     * @return
     * The runStatus
     */
    public RunStatus getRunStatus() {
        return runStatus;
    }

    /**
     *
     * @param runStatus
     * The run_status
     */
    public void setRunStatus(RunStatus runStatus) {
        this.runStatus = runStatus;
    }

    /**
     *
     * @return
     * The webLink
     */
    public String getWebLink() {
        return webLink;
    }

    /**
     *
     * @param webLink
     * The web_link
     */
    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

}