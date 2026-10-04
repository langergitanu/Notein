package com.orion.notein.p607ui.noteeditor.addtext.textstylebox;

import Oooo0oO.C21022OooO0OO;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28766o0000Oo;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOOo.InterfaceC29094OooO0O0;
import o0o00Ooo.C29920OooO0oo;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.textstylebox.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23384OooO0o0 implements InterfaceC29094OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C29051OooOO0o f74125OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ TextStyleBox f74126OooO0O0;

    public C23384OooO0o0(C29051OooOO0o c29051OooOO0o, TextStyleBox textStyleBox) {
        this.f74125OooO00o = c29051OooOO0o;
        this.f74126OooO0O0 = textStyleBox;
    }

    @Override // o0OoOOOo.InterfaceC29094OooO0O0
    public final void OooO00o(int i, boolean z) {
        this.f74125OooO00o.OooOO0o(i, z);
    }

    @Override // o0OoOOOo.InterfaceC29094OooO0O0
    public final void OooO0O0(C29920OooO0oo c29920OooO0oo) {
        TextStyleBox textStyleBox = this.f74126OooO0O0;
        if (c29920OooO0oo.f106162OooO0o == 2 && !c29920OooO0oo.f106164OooO0oO) {
            textStyleBox.f74149Oooo0o.dismiss();
        }
        TextStyleBox.OooO00o oooO00o = textStyleBox.f74155OoooO00;
        if (oooO00o != null) {
            oooO00o.OooO0O0(c29920OooO0oo);
        }
    }

    @Override // o0OoOOOo.InterfaceC29094OooO0O0
    public final void OooO0OO(String id, String name) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        C28026OooO0OO.OooO0O0(C21022OooO0OO.OooO0O0(this.f74126OooO0O0), new C28766o0000Oo(name, id));
    }

    @Override // o0OoOOOo.InterfaceC29094OooO0O0
    public final void OooO0Oo(String id) {
        OooOOO0.OooO0oO(id, "id");
        this.f74125OooO00o.OooO0o0(id);
    }

    @Override // o0OoOOOo.InterfaceC29094OooO0O0
    public final void OooO0o0(int i, int i2) {
        int i3 = TextStyleBox.f74132o000oOoO;
        this.f74126OooO0O0.OooOO0(i, i2);
    }
}
