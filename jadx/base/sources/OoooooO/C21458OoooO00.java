package OoooooO;

import OooOoO.C20509OooO0oo;
import java.util.Iterator;
import java.util.List;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: OoooooO.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21458OoooO00 extends AbstractC21459OoooO0O implements Iterable<AbstractC21459OoooO0O>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float f62123OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f62124OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f62125OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f62126OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final float f62127OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float f62128OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final float f62129OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final float f62130OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final List<AbstractC21410OooO0o> f62131OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final List<AbstractC21459OoooO0O> f62132Oooo000;

    /* JADX INFO: renamed from: OoooooO.OoooO00$OooO00o */
    public static final class OooO00o implements Iterator<AbstractC21459OoooO0O>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Iterator<AbstractC21459OoooO0O> f62133OooOo0o;

        public OooO00o(C21458OoooO00 c21458OoooO00) {
            this.f62133OooOo0o = c21458OoooO00.f62132Oooo000.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f62133OooOo0o.hasNext();
        }

        @Override // java.util.Iterator
        public final AbstractC21459OoooO0O next() {
            return this.f62133OooOo0o.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21458OoooO00(String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends AbstractC21410OooO0o> clipPathData, List<? extends AbstractC21459OoooO0O> children) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(clipPathData, "clipPathData");
        kotlin.jvm.internal.OooOOO0.OooO0oO(children, "children");
        this.f62124OooOo0o = name;
        this.f62123OooOo = f;
        this.f62126OooOoO0 = f2;
        this.f62125OooOoO = f3;
        this.f62127OooOoOO = f4;
        this.f62129OooOoo0 = f5;
        this.f62128OooOoo = f6;
        this.f62130OooOooO = f7;
        this.f62131OooOooo = clipPathData;
        this.f62132Oooo000 = children;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C21458OoooO00)) {
            C21458OoooO00 c21458OoooO00 = (C21458OoooO00) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f62124OooOo0o, c21458OoooO00.f62124OooOo0o) && this.f62123OooOo == c21458OoooO00.f62123OooOo && this.f62126OooOoO0 == c21458OoooO00.f62126OooOoO0 && this.f62125OooOoO == c21458OoooO00.f62125OooOoO && this.f62127OooOoOO == c21458OoooO00.f62127OooOoOO && this.f62129OooOoo0 == c21458OoooO00.f62129OooOoo0 && this.f62128OooOoo == c21458OoooO00.f62128OooOoo && this.f62130OooOooO == c21458OoooO00.f62130OooOooO && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f62131OooOooo, c21458OoooO00.f62131OooOooo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f62132Oooo000, c21458OoooO00.f62132Oooo000);
        }
        return false;
    }

    public final int hashCode() {
        return this.f62132Oooo000.hashCode() + C21445Oooo.OooO00o(this.f62131OooOooo, C20509OooO0oo.OooO0OO(this.f62130OooOooO, C20509OooO0oo.OooO0OO(this.f62128OooOoo, C20509OooO0oo.OooO0OO(this.f62129OooOoo0, C20509OooO0oo.OooO0OO(this.f62127OooOoOO, C20509OooO0oo.OooO0OO(this.f62125OooOoO, C20509OooO0oo.OooO0OO(this.f62126OooOoO0, C20509OooO0oo.OooO0OO(this.f62123OooOo, this.f62124OooOo0o.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC21459OoooO0O> iterator() {
        return new OooO00o(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21458OoooO00() {
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        int i = C21457OoooO0.f62122OooO00o;
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, c34434OooOoO, c34434OooOoO);
    }
}
