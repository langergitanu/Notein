package oOo000oo;

import Oooo0.C20855OooooOO;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.AbstractC34421OooO0Oo;
import oOo000Oo.OooOOO;

/* JADX INFO: renamed from: oOo000oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34453OooO0O0<T extends Enum<T>> extends AbstractC34421OooO0Oo<T> implements InterfaceC34452OooO00o<T>, Serializable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final T[] f123482OooOo0o;

    public C34453OooO0O0(T[] entries) {
        OooOOO0.OooO0oO(entries, "entries");
        this.f123482OooOo0o = entries;
    }

    private final Object writeReplace() {
        return new C34454OooO0OO(this.f123482OooOo0o);
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0
    public final int OooO0O0() {
        return this.f123482OooOo0o.length;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        OooOOO0.OooO0oO(element, "element");
        return ((Enum) OooOOO.OooOooo(element.ordinal(), this.f123482OooOo0o)) == element;
    }

    @Override // java.util.List
    public final Object get(int i) {
        T[] tArr = this.f123482OooOo0o;
        int length = tArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, length, "index: ", ", size: "));
        }
        return tArr[i];
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        OooOOO0.OooO0oO(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) OooOOO.OooOooo(iOrdinal, this.f123482OooOo0o)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        OooOOO0.OooO0oO(element, "element");
        return indexOf(element);
    }
}
