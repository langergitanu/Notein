package com.orion.notein.domain.mapper;

import com.orion.notein.MainActivity;
import java.io.File;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: com.orion.notein.domain.mapper.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22976OooO0Oo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f70408OooOo0o;

    public /* synthetic */ C22976OooO0Oo(int i) {
        this.f70408OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f70408OooOo0o) {
            case 0:
                return PdfTextCacheMapper.json$lambda$0((oOo00O0O.OooO0o) obj);
            case 1:
                return MainActivity.onCreate$lambda$14((Void) obj);
            default:
                String name = ((File) obj).getName();
                OooOOO0.OooO0o(name, "getName(...)");
                return name;
        }
    }
}
