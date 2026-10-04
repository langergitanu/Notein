package o0OoO0o;

import OooOo.C20481OooOOoo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.ink.brush.behavior.BinaryOpNodeNative;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28641OooO00o extends AbstractC28667OooOoO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f101517OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AbstractC28667OooOoO f101518OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC28667OooOoO f101519OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C19922OooO00o f101520OooO0oO;

    /* JADX INFO: renamed from: o0OoO0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19922OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C20481OooOOoo<C19922OooO00o> f101521OooO0O0 = new C20481OooOOoo<>((Object) null);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f101522OooO00o;

        static {
            new C19922OooO00o(0, "PRODUCT");
            new C19922OooO00o(1, "SUM");
            new C19922OooO00o(2, "MIN");
            new C19922OooO00o(3, "MAX");
            new C19922OooO00o(4, "AND_THEN");
            new C19922OooO00o(5, "OR_ELSE");
            new C19922OooO00o(6, "XOR_ELSE");
        }

        public C19922OooO00o(int i, String str) {
            this.f101522OooO00o = str;
            C20481OooOOoo<C19922OooO00o> c20481OooOOoo = f101521OooO0O0;
            if (c20481OooOOoo.OooO00o(i)) {
                throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate BinaryOp value: ", ".").toString());
            }
            c20481OooOOoo.OooO0oO(i, this);
        }

        public final String toString() {
            return "BinaryOp." + this.f101522OooO00o;
        }
    }

    public C28641OooO00o() {
        throw null;
    }

    public C28641OooO00o(o000OO00.OooO0o oooO0o, AbstractC28667OooOoO abstractC28667OooOoO, AbstractC28667OooOoO abstractC28667OooOoO2) {
        super(oooO0o, C34429OooOOo0.OooOO0o(abstractC28667OooOoO, abstractC28667OooOoO2));
        this.f101519OooO0o0 = abstractC28667OooOoO;
        this.f101518OooO0o = abstractC28667OooOoO2;
        C20481OooOOoo<C19922OooO00o> c20481OooOOoo = C19922OooO00o.f101521OooO0O0;
        int operationInt = BinaryOpNodeNative.f65357OooO00o.getOperationInt(OooO00o());
        C19922OooO00o c19922OooO00oOooO0O0 = C19922OooO00o.f101521OooO0O0.OooO0O0(operationInt);
        if (c19922OooO00oOooO0O0 == null) {
            throw new IllegalStateException(C21532OooOOo.OooO0OO(operationInt, "Invalid BinaryOp value: ").toString());
        }
        this.f101520OooO0oO = c19922OooO00oOooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C28641OooO00o)) {
            if (obj == this) {
                return true;
            }
            C28641OooO00o c28641OooO00o = (C28641OooO00o) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101520OooO0oO, c28641OooO00o.f101520OooO0oO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101519OooO0o0, c28641OooO00o.f101519OooO0o0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101518OooO0o, c28641OooO00o.f101518OooO0o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f101518OooO0o.hashCode() + ((this.f101519OooO0o0.hashCode() + (this.f101520OooO0oO.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BinaryOpNode(" + this.f101520OooO0oO.f101522OooO00o + ", " + this.f101519OooO0o0 + ", " + this.f101518OooO0o + ")";
    }
}
