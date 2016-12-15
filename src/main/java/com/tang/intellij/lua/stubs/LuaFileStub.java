package com.tang.intellij.lua.stubs;

import com.intellij.psi.stubs.PsiFileStubImpl;
import com.intellij.psi.tree.IStubFileElementType;
import com.tang.intellij.lua.lang.LuaParserDefinition;
import com.tang.intellij.lua.psi.LuaFile;

/**
 *
 * Created by tangzx on 2016/11/27.
 */
public class LuaFileStub extends PsiFileStubImpl<LuaFile> {
    public LuaFileStub(LuaFile file) {
        super(file);
    }

    @Override
    public IStubFileElementType getType() {
        return LuaParserDefinition.FILE;
    }
}