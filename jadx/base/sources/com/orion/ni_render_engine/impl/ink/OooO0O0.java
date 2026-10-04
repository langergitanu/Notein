package com.orion.ni_render_engine.impl.ink;

import java.util.ArrayList;
import o0oo0OoO.C31277OooOO0O;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayList f69446OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f69447OooO0O0 = new Object();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C31277OooOO0O f69448OooO00o;

        public OooO00o(C31277OooOO0O c31277OooOO0O) {
            this.f69448OooO00o = c31277OooOO0O;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO00o) {
                return this.f69448OooO00o.equals(((OooO00o) obj).f69448OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (this.f69448OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "RendererEntry(renderer=" + this.f69448OooO00o + ", priority=0)";
        }
    }
}
