package oO0O0O0;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: oO0O0O0.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32586Ooooo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<ClassLoader> f117093OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f117094OooO0O0;

    public C32586Ooooo00(ClassLoader classLoader) {
        this.f117093OooO00o = new WeakReference<>(classLoader);
        this.f117094OooO0O0 = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C32586Ooooo00) && this.f117093OooO00o.get() == ((C32586Ooooo00) obj).f117093OooO00o.get();
    }

    public final int hashCode() {
        return this.f117094OooO0O0;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = this.f117093OooO00o.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
