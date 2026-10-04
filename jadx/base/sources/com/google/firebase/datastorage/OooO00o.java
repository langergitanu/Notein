package com.google.firebase.datastorage;

import android.content.Context;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import kotlin.jvm.internal.OooOOO0;
import o0o0OOO.C30520o000000o;
import o0o0OOOo.EnumC30546OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO00o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68051OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68052OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f68052OooOo0o = i;
        this.f68051OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f68052OooOo0o) {
            case 0:
                return JavaDataStorage.dataStore_delegate$lambda$0((JavaDataStorage) this.f68051OooOo, (Context) obj);
            default:
                EnumC30546OooO0O0 previewType = (EnumC30546OooO0O0) obj;
                OooOOO0.OooO0oO(previewType, "previewType");
                C30520o000000o c30520o000000oOooOooo = ((StandardTemplateFragment) this.f68051OooOo).OooOooo();
                c30520o000000oOooOooo.getClass();
                C33781o00o0O c33781o00o0O = c30520o000000oOooOooo.f109029Oooo00O;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, previewType);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
