/*
 *    Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.downloader;

/**
 * Created by amitshekhar on 13/11/17.
 */

public class Error {

    private boolean isServerError;
    private boolean isConnectionError;
    private Exception exception;

    public Error(Exception exception) {
        this.exception = exception;
    }

    public boolean isServerError() {
        return isServerError;
    }

    public void setServerError(boolean serverError) {
        isServerError = serverError;
    }

    public boolean isConnectionError() {
        return isConnectionError;
    }

    public void setConnectionError(boolean connectionError) {
        isConnectionError = connectionError;
    }

    public Exception getException() {
        return exception;
    }

    public static class ResponseCancelledException extends Exception { }
    public static class ResponseUnsuccessfulException extends Exception {
        private int mResponseCode;

        public ResponseUnsuccessfulException(int responseCode) {
            this.mResponseCode = responseCode;
        }

        public int getResponseCode() {
            return mResponseCode;
        }
    }
}
