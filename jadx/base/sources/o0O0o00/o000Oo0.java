package o0O0o00;

import com.orion.editor.PDFView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f88758OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PDFView f88759OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<String> f88760OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0oo0.OooO0o f88761OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0oo00oO.OooO0o f88762OooO0o0;

    public o000Oo0(PDFView pDFView, o0oo00oO.OooO0o oooO0o) {
        this.f88758OooO00o = false;
        this.f88759OooO0O0 = pDFView;
        this.f88762OooO0o0 = oooO0o;
        this.f88761OooO0Oo = null;
        Object[] objArr = {"lenovo", "vivo", "samsung"};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.o000oOoO.OooO00o(obj, "duplicate element: "));
            }
        }
        this.f88760OooO0OO = Collections.unmodifiableSet(hashSet);
    }

    public o000Oo0(PDFView pDFView, o0oo0.OooO0o oooO0o) {
        this.f88758OooO00o = false;
        this.f88759OooO0O0 = pDFView;
        this.f88761OooO0Oo = oooO0o;
        this.f88762OooO0o0 = null;
        Object[] objArr = {"lenovo", "vivo", "samsung"};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.o000oOoO.OooO00o(obj, "duplicate element: "));
            }
        }
        this.f88760OooO0OO = Collections.unmodifiableSet(hashSet);
    }
}
