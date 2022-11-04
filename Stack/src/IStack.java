// Copyright 2022 Michele Schimd (ITIS C. Zuccante)

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Interface for the <em>stack</em> data structure storing {@link Object}
 * references.
 *
 * @version 0.1
 * @author Costantini, Isandelli
 *
 */
public interface IStack {
    void push(Object o);
    Object pop();
    Object top();
    int size();
    boolean isEmpty();
}