package oO0OoO0;

import oO0O0OO.o000oOoO;
import oO0OO0Oo.AbstractC32916OooO00o;
import oO0OO0Oo.InterfaceC32918OooO0OO;

/* JADX INFO: renamed from: oO0OoO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33238OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32918OooO0OO f120257OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0OO00.OooO0O0 f120258OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC32916OooO00o f120259OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000oOoO f120260OooO0Oo;

    public C33238OooO0oo(InterfaceC32918OooO0OO nameResolver, oO0OO00.OooO0O0 classProto, AbstractC32916OooO00o abstractC32916OooO00o, o000oOoO sourceElement) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        kotlin.jvm.internal.OooOOO0.OooO0oO(classProto, "classProto");
        kotlin.jvm.internal.OooOOO0.OooO0oO(sourceElement, "sourceElement");
        this.f120257OooO00o = nameResolver;
        this.f120258OooO0O0 = classProto;
        this.f120259OooO0OO = abstractC32916OooO00o;
        this.f120260OooO0Oo = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33238OooO0oo)) {
            return false;
        }
        C33238OooO0oo c33238OooO0oo = (C33238OooO0oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120257OooO00o, c33238OooO0oo.f120257OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120258OooO0O0, c33238OooO0oo.f120258OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120259OooO0OO, c33238OooO0oo.f120259OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120260OooO0Oo, c33238OooO0oo.f120260OooO0Oo);
    }

    public final int hashCode() {
        return this.f120260OooO0Oo.hashCode() + ((this.f120259OooO0OO.hashCode() + ((this.f120258OooO0O0.hashCode() + (this.f120257OooO00o.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f120257OooO00o + ", classProto=" + this.f120258OooO0O0 + ", metadataVersion=" + this.f120259OooO0OO + ", sourceElement=" + this.f120260OooO0Oo + ')';
    }
}
