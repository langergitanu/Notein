package o0OoO0o;

import androidx.ink.brush.behavior.ToolTypeFilterNodeNative;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import o000OO00.C24478Oooo00o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0OoO0o.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28668OooOoO0 extends AbstractC28667OooOoO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Set<C24478Oooo00o> f101598OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC28667OooOoO f101599OooO0o0;

    public C28668OooOoO0() {
        throw null;
    }

    public C28668OooOoO0(o000OO00.OooO0o oooO0o, AbstractC28667OooOoO abstractC28667OooOoO) {
        super(oooO0o, com.facebook.soloader.OooOo.OooO0oO(abstractC28667OooOoO));
        this.f101599OooO0o0 = abstractC28667OooOoO;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ToolTypeFilterNodeNative toolTypeFilterNodeNative = ToolTypeFilterNodeNative.f65369OooO00o;
        if (toolTypeFilterNodeNative.getMouseEnabled(OooO00o())) {
            linkedHashSet.add(C24478Oooo00o.f82774OooO0o0);
        }
        if (toolTypeFilterNodeNative.getTouchEnabled(OooO00o())) {
            linkedHashSet.add(C24478Oooo00o.f82773OooO0o);
        }
        if (toolTypeFilterNodeNative.getStylusEnabled(OooO00o())) {
            linkedHashSet.add(C24478Oooo00o.f82775OooO0oO);
        }
        if (toolTypeFilterNodeNative.getUnknownEnabled(OooO00o())) {
            linkedHashSet.add(C24478Oooo00o.f82772OooO0Oo);
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        Set<C24478Oooo00o> setUnmodifiableSet = Collections.unmodifiableSet(oOo000Oo.OooOo.o0OO00O(linkedHashSet));
        kotlin.jvm.internal.OooOOO0.OooO0o(setUnmodifiableSet, "unmodifiableSet(...)");
        this.f101598OooO0o = setUnmodifiableSet;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C28668OooOoO0)) {
            if (obj == this) {
                return true;
            }
            C28668OooOoO0 c28668OooOoO0 = (C28668OooOoO0) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101598OooO0o, c28668OooOoO0.f101598OooO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101599OooO0o0, c28668OooOoO0.f101599OooO0o0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f101599OooO0o0.hashCode() + (this.f101598OooO0o.hashCode() * 31);
    }

    public final String toString() {
        return "ToolTypeFilterNode(" + this.f101598OooO0o + ", " + this.f101599OooO0o0 + ")";
    }
}
