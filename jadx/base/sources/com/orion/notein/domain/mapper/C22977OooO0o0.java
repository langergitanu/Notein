package com.orion.notein.domain.mapper;

import java.io.File;
import o0ooO0O0.C31430OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: com.orion.notein.domain.mapper.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22977OooO0o0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f70409OooOo0o;

    public /* synthetic */ C22977OooO0o0(int i) {
        this.f70409OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f70409OooOo0o) {
            case 0:
                return StrokeMapper.json$lambda$0((oOo00O0O.OooO0o) obj);
            default:
                File file = (File) obj;
                return OooO0O0.OooO00o.OooO0O0(file.getName(), " (", C31430OooO00o.OooO0OO(file.length()), ")");
        }
    }
}
