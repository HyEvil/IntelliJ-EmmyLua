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

package com.tang.intellij.lua.debugger.attach;

import com.intellij.execution.process.ProcessInfo;
import com.intellij.xdebugger.XDebugSession;
import org.jetbrains.annotations.NotNull;

/**
 *
 * Created by tangzx on 2017/5/7.
 */
public class LuaAttachDebugProcessEx extends LuaAttachDebugProcess {
    private final ProcessInfo processInfo;
    LuaAttachDebugProcessEx(@NotNull XDebugSession session, ProcessInfo processInfo) {
        super(session);
        this.processInfo = processInfo;
    }

    @Override
    protected LuaAttachBridge startBridge() {
        bridge = new LuaAttachBridge(getSession());
        bridge.setProtoHandler(this);
        bridge.setProtoFactory(this);
        bridge.attach(processInfo.getPid());
        return bridge;
    }
}
