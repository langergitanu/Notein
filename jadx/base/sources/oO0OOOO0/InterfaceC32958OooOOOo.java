package oO0OOOO0;

import java.io.IOException;

/* JADX INFO: renamed from: oO0OOOO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC32958OooOOOo extends InterfaceC32960OooOOo0 {

    /* JADX INFO: renamed from: oO0OOOO0.OooOOOo$OooO00o */
    public interface OooO00o extends Cloneable, InterfaceC32960OooOOo0 {
        OooO00o Oooo0OO(C32951OooO0Oo c32951OooO0Oo, OooO0o oooO0o) throws IOException;

        InterfaceC32958OooOOOo build();
    }

    void OooO00o(C32952OooO0o0 c32952OooO0o0) throws IOException;

    int getSerializedSize();

    OooO00o newBuilderForType();

    OooO00o toBuilder();
}
