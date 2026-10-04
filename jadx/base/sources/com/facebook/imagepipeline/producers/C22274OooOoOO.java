package com.facebook.imagepipeline.producers;

import java.util.Map;
import o00ooO00.C25756OooO00o;
import o00ooO00.C25757OooO0O0;
import o00ooO00.InterfaceC25758OooO0OO;
import o00ooO00.InterfaceC25759OooO0Oo;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22274OooOoOO implements InterfaceC25758OooO0OO, o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25759OooO0Oo f67367OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25758OooO0OO f67368OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25757OooO0O0 f67369OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25756OooO00o f67370OooO0Oo;

    public C22274OooOoOO(C25757OooO0O0 c25757OooO0O0, C25756OooO00o c25756OooO00o) {
        this.f67367OooO00o = c25757OooO0O0;
        this.f67368OooO0O0 = c25756OooO00o;
        this.f67369OooO0OO = c25757OooO0O0;
        this.f67370OooO0Oo = c25756OooO00o;
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooO(InterfaceC22288OoooO context, String str, Map map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        InterfaceC25759OooO0Oo interfaceC25759OooO0Oo = this.f67367OooO00o;
        if (interfaceC25759OooO0Oo != null) {
            interfaceC25759OooO0Oo.OooO0oO(context.getId(), str, map);
        }
        InterfaceC25758OooO0OO interfaceC25758OooO0OO = this.f67368OooO0O0;
        if (interfaceC25758OooO0OO != null) {
            interfaceC25758OooO0OO.OooO(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooO00o(InterfaceC22288OoooO context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        InterfaceC25759OooO0Oo interfaceC25759OooO0Oo = this.f67367OooO00o;
        if (interfaceC25759OooO0Oo != null) {
            interfaceC25759OooO0Oo.OooO0o0(context.getId());
        }
        InterfaceC25758OooO0OO interfaceC25758OooO0OO = this.f67368OooO0O0;
        if (interfaceC25758OooO0OO != null) {
            interfaceC25758OooO0OO.OooO00o(context);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooO0O0(InterfaceC22288OoooO context, String str, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        InterfaceC25759OooO0Oo interfaceC25759OooO0Oo = this.f67367OooO00o;
        if (interfaceC25759OooO0Oo != null) {
            interfaceC25759OooO0Oo.OooO(context.getId(), str, z);
        }
        InterfaceC25758OooO0OO interfaceC25758OooO0OO = this.f67368OooO0O0;
        if (interfaceC25758OooO0OO != null) {
            interfaceC25758OooO0OO.OooO0O0(context, str, z);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooO0OO(InterfaceC22288OoooO context, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        InterfaceC25759OooO0Oo interfaceC25759OooO0Oo = this.f67367OooO00o;
        if (interfaceC25759OooO0Oo != null) {
            interfaceC25759OooO0Oo.OooO0O0(context.getId(), str);
        }
        InterfaceC25758OooO0OO interfaceC25758OooO0OO = this.f67368OooO0O0;
        if (interfaceC25758OooO0OO != null) {
            interfaceC25758OooO0OO.OooO0OO(context, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final boolean OooO0Oo(InterfaceC22288OoooO context, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        InterfaceC25759OooO0Oo interfaceC25759OooO0Oo = this.f67367OooO00o;
        Boolean boolValueOf = interfaceC25759OooO0Oo != null ? Boolean.valueOf(interfaceC25759OooO0Oo.OooO0o(context.getId())) : null;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(boolValueOf, Boolean.TRUE)) {
            InterfaceC25758OooO0OO interfaceC25758OooO0OO = this.f67368OooO0O0;
            boolValueOf = interfaceC25758OooO0OO != null ? Boolean.valueOf(interfaceC25758OooO0OO.OooO0Oo(context, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // o00ooO00.InterfaceC25758OooO0OO
    public final void OooO0o(C22298Ooooo00 producerContext) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(producerContext, "producerContext");
        C25757OooO0O0 c25757OooO0O0 = this.f67369OooO0OO;
        if (c25757OooO0O0 != null) {
            c25757OooO0O0.OooOO0(producerContext.f67285OooOo0o, producerContext.f67284OooOo, producerContext.ooOO());
        }
        C25756OooO00o c25756OooO00o = this.f67370OooO0Oo;
        if (c25756OooO00o != null) {
            c25756OooO00o.OooO0o(producerContext);
        }
    }

    @Override // o00ooO00.InterfaceC25758OooO0OO
    public final void OooO0o0(InterfaceC22288OoooO producerContext) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(producerContext, "producerContext");
        C25757OooO0O0 c25757OooO0O0 = this.f67369OooO0OO;
        if (c25757OooO0O0 != null) {
            c25757OooO0O0.OooOO0O(producerContext.getId());
        }
        C25756OooO00o c25756OooO00o = this.f67370OooO0Oo;
        if (c25756OooO00o != null) {
            c25756OooO00o.OooO0o0(producerContext);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooO0oO(InterfaceC22288OoooO context, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        InterfaceC25759OooO0Oo interfaceC25759OooO0Oo = this.f67367OooO00o;
        if (interfaceC25759OooO0Oo != null) {
            interfaceC25759OooO0Oo.OooO0Oo(context.getId(), str);
        }
        InterfaceC25758OooO0OO interfaceC25758OooO0OO = this.f67368OooO0O0;
        if (interfaceC25758OooO0OO != null) {
            interfaceC25758OooO0OO.OooO0oO(context, str);
        }
    }

    @Override // o00ooO00.InterfaceC25758OooO0OO
    public final void OooO0oo(InterfaceC22288OoooO producerContext, Throwable th) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(producerContext, "producerContext");
        C25757OooO0O0 c25757OooO0O0 = this.f67369OooO0OO;
        if (c25757OooO0O0 != null) {
            c25757OooO0O0.OooO0oo(producerContext.OooOOoo(), producerContext.getId(), th, producerContext.ooOO());
        }
        C25756OooO00o c25756OooO00o = this.f67370OooO0Oo;
        if (c25756OooO00o != null) {
            c25756OooO00o.OooO0oo(producerContext, th);
        }
    }

    @Override // o00ooO00.InterfaceC25758OooO0OO
    public final void OooOO0(C22298Ooooo00 c22298Ooooo00) {
        C25757OooO0O0 c25757OooO0O0 = this.f67369OooO0OO;
        if (c25757OooO0O0 != null) {
            c25757OooO0O0.OooO00o(c22298Ooooo00.f67285OooOo0o, c22298Ooooo00.f67286OooOoO, c22298Ooooo00.f67284OooOo, c22298Ooooo00.ooOO());
        }
        C25756OooO00o c25756OooO00o = this.f67370OooO0Oo;
        if (c25756OooO00o != null) {
            c25756OooO00o.OooOO0(c22298Ooooo00);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooOO0O(InterfaceC22288OoooO context, String str, Throwable th, Map map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        InterfaceC25759OooO0Oo interfaceC25759OooO0Oo = this.f67367OooO00o;
        if (interfaceC25759OooO0Oo != null) {
            interfaceC25759OooO0Oo.OooO0OO(context.getId(), str, th, map);
        }
        InterfaceC25758OooO0OO interfaceC25758OooO0OO = this.f67368OooO0O0;
        if (interfaceC25758OooO0OO != null) {
            interfaceC25758OooO0OO.OooOO0O(context, str, th, map);
        }
    }
}
