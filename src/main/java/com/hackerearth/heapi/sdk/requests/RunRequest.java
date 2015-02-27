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

package com.hackerearth.heapi.sdk.requests;

import com.google.gson.Gson;
import com.hackerearth.heapi.sdk.options.RunOptions;
import com.hackerearth.heapi.sdk.responses.RunResponse;

public class RunRequest extends BaseRequest {

    public static final String RUN_ENDPOINT = "http://api.hackerearth.com/code/run/";;

    public RunRequest(String clientSecret, RunOptions params){
        super(clientSecret, params);
    }

    @Override
    public RunResponse Execute(){
        Gson gson = new Gson();
        this.options.setClientSecret(this.clientSecret);
        String jsonOptions = gson.toJson(this.options, RunOptions.class);
        String response = sendRequest(RUN_ENDPOINT, jsonOptions);
        return null;
    }
}

