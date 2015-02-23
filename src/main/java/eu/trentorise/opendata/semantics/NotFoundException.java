/* 
 * Copyright 2013-2015   Trento Rise   trentorise.eu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.trentorise.opendata.semantics;

/**
 * @author David Leoni <david.leoni@unitn.it>
 * @date June 8, 2014
 */
public class NotFoundException extends OpenEntityException {


    public NotFoundException(Exception ex) {
        super(ex);
    }

    public NotFoundException(String s, Exception ex) {
        super(s, ex);
    }

    public NotFoundException(String s) {
        super(s);
    }
}