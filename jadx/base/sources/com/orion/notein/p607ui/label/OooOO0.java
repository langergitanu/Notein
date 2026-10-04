package com.orion.notein.p607ui.label;

import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0ooO.C28456OoooOoO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOO0 {

    public static final class OooO00o extends OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f72054OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f72055OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f72056OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f72057OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f72058OooO0o0;

        public OooO00o(int i, String inputText, ArrayList arrayList, boolean z) {
            OooOOO0.OooO0oO(inputText, "inputText");
            this.f72054OooO00o = inputText;
            this.f72055OooO0O0 = arrayList;
            this.f72056OooO0OO = i;
            this.f72057OooO0Oo = z;
            this.f72058OooO0o0 = -1L;
        }

        @Override // com.orion.notein.p607ui.label.OooOO0
        public final long OooO00o() {
            return this.f72058OooO0o0;
        }

        @Override // com.orion.notein.p607ui.label.OooOO0
        public final boolean OooO0O0() {
            return this.f72057OooO0Oo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.f72054OooO00o, oooO00o.f72054OooO00o) && OooOOO0.OooO0O0(this.f72055OooO0O0, oooO00o.f72055OooO0O0) && this.f72056OooO0OO == oooO00o.f72056OooO0OO && this.f72057OooO0Oo == oooO00o.f72057OooO0Oo;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72057OooO0Oo) + C20785Oooo00o.OooO00o(this.f72056OooO0OO, (this.f72055OooO0O0.hashCode() + (this.f72054OooO00o.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CreateItem(inputText=");
            sb.append(this.f72054OooO00o);
            sb.append(", colors=");
            sb.append(this.f72055OooO0O0);
            sb.append(", selectedColorIndex=");
            sb.append(this.f72056OooO0OO);
            sb.append(", isEditing=");
            return OooOOO.OooO00o(sb, ")", this.f72057OooO0Oo);
        }
    }

    public static final class OooO0O0 extends OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C28456OoooOoO f72059OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f72060OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f72061OooO0OO;

        public OooO0O0(C28456OoooOoO data) {
            OooOOO0.OooO0oO(data, "data");
            this.f72059OooO00o = data;
            this.f72060OooO0O0 = data.f100833OooO00o;
            this.f72061OooO0OO = data.f100837OooO0o;
        }

        @Override // com.orion.notein.p607ui.label.OooOO0
        public final long OooO00o() {
            return this.f72060OooO0O0;
        }

        @Override // com.orion.notein.p607ui.label.OooOO0
        public final boolean OooO0O0() {
            return this.f72061OooO0OO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0O0) && OooOOO0.OooO0O0(this.f72059OooO00o, ((OooO0O0) obj).f72059OooO00o);
        }

        public final int hashCode() {
            return this.f72059OooO00o.hashCode();
        }

        public final String toString() {
            return "LabelItem(data=" + this.f72059OooO00o + ")";
        }
    }

    public abstract long OooO00o();

    public abstract boolean OooO0O0();
}
