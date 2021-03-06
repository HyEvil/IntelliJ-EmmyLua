/*
 * Copyright (c) 2017. tangzx(love.tangzx@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tang.intellij.lua.editor.structure

import com.tang.intellij.lua.lang.LuaIcons
import com.tang.intellij.lua.psi.LuaLocalDef

/**

 * Created by TangZX on 2016/12/28.
 */
class LuaLocalElement internal constructor(localDef: LuaLocalDef) : LuaTreeElement<LuaLocalDef>(localDef, LuaIcons.LOCAL_VAR) {

    override fun getPresentableText(): String? {
        val nameList = element.nameList
        if (nameList != null)
            return "local " + nameList.text
        return null
    }
}
