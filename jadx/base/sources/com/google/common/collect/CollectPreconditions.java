package com.google.common.collect;

import OooOo.C20485OooOoO;
import androidx.datastore.preferences.protobuf.o000oOoO;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
@ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(o000oOoO.OooO00o(obj2, "null key in entry: null="));
        }
        if (obj2 == null) {
            throw new NullPointerException(C20485OooOoO.OooO0O0("null value in entry: ", obj, "=null"));
        }
    }

    public static int checkNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void checkPositive(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i);
    }

    public static void checkRemove(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }

    public static long checkNonnegative(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + j);
    }
}
