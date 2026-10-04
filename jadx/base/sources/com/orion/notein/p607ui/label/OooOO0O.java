package com.orion.notein.p607ui.label;

import Oooo0oO.C21023OooO0Oo;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOO0O {

    public static final class OooO00o extends OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f72062OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f72063OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f72064OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f72065OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f72066OooO0o0;

        public OooO00o(int i, String inputText, ArrayList arrayList, boolean z) {
            OooOOO0.OooO0oO(inputText, "inputText");
            this.f72062OooO00o = z;
            this.f72063OooO0O0 = inputText;
            this.f72064OooO0OO = arrayList;
            this.f72065OooO0Oo = i;
            this.f72066OooO0o0 = -1L;
        }

        @Override // com.orion.notein.p607ui.label.OooOO0O
        public final long OooO00o() {
            return this.f72066OooO0o0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f72062OooO00o == oooO00o.f72062OooO00o && OooOOO0.OooO0O0(this.f72063OooO0O0, oooO00o.f72063OooO0O0) && OooOOO0.OooO0O0(this.f72064OooO0OO, oooO00o.f72064OooO0OO) && this.f72065OooO0Oo == oooO00o.f72065OooO0Oo;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f72065OooO0Oo) + ((this.f72064OooO0OO.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Boolean.hashCode(this.f72062OooO00o) * 31, 31, this.f72063OooO0O0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CreateItem(isEditing=");
            sb.append(this.f72062OooO00o);
            sb.append(", inputText=");
            sb.append(this.f72063OooO0O0);
            sb.append(", colors=");
            sb.append(this.f72064OooO0OO);
            sb.append(", selectedColorIndex=");
            return C21023OooO0Oo.OooO0OO(")", this.f72065OooO0Oo, sb);
        }
    }

    public static final class OooO0O0 extends OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C23132OooO0Oo f72067OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f72068OooO0O0;

        public OooO0O0(C23132OooO0Oo data) {
            OooOOO0.OooO0oO(data, "data");
            this.f72067OooO00o = data;
            this.f72068OooO0O0 = data.f71988OooO00o;
        }

        @Override // com.orion.notein.p607ui.label.OooOO0O
        public final long OooO00o() {
            return this.f72068OooO0O0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0O0) && OooOOO0.OooO0O0(this.f72067OooO00o, ((OooO0O0) obj).f72067OooO00o);
        }

        public final int hashCode() {
            return this.f72067OooO00o.hashCode();
        }

        public final String toString() {
            return "LabelItem(data=" + this.f72067OooO00o + ")";
        }
    }

    public abstract long OooO00o();
}
