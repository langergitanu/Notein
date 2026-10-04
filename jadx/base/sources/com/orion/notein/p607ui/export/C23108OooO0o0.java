package com.orion.notein.p607ui.export;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.OooO0o;

/* JADX INFO: renamed from: com.orion.notein.ui.export.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23108OooO0o0 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExportRequest f71779OooO00o;

    /* JADX INFO: renamed from: com.orion.notein.ui.export.OooO0o0$OooO00o */
    public static final class OooO00o {
        public static C23108OooO0o0 OooO00o(Bundle bundle) {
            if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C23108OooO0o0.class, "export_request")) {
                throw new IllegalArgumentException("Required argument \"export_request\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(ExportRequest.class) && !Serializable.class.isAssignableFrom(ExportRequest.class)) {
                throw new UnsupportedOperationException(ExportRequest.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            ExportRequest exportRequest = (ExportRequest) bundle.get("export_request");
            if (exportRequest != null) {
                return new C23108OooO0o0(exportRequest);
            }
            throw new IllegalArgumentException("Argument \"export_request\" is marked as non-null but was passed a null value.");
        }
    }

    public C23108OooO0o0(ExportRequest exportRequest) {
        this.f71779OooO00o = exportRequest;
    }

    public static final C23108OooO0o0 fromBundle(Bundle bundle) {
        return OooO00o.OooO00o(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23108OooO0o0) && OooOOO0.OooO0O0(this.f71779OooO00o, ((C23108OooO0o0) obj).f71779OooO00o);
    }

    public final int hashCode() {
        return this.f71779OooO00o.hashCode();
    }

    public final String toString() {
        return "ExportBottomSheetFragmentArgs(exportRequest=" + this.f71779OooO00o + ")";
    }
}
