package com.bumptech.glide;

import com.bumptech.glide.OooOOO;
import o00o0.C25204OooO00o;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OooOOO<CHILD extends OooOOO<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        Object obj2 = C25204OooO00o.f85806OooO0O0;
        ((OooOOO) obj).getClass();
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        return obj2.equals(obj2);
    }

    public int hashCode() {
        return C25204OooO00o.f85806OooO0O0.hashCode();
    }
}
