package oO00O;

import java.security.PrivateKey;
import java.security.PublicKey;

/* JADX INFO: renamed from: oO00O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32141OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PublicKey f115265OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PublicKey f115266OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PrivateKey f115267OooO0OO;

    public C32141OooO0oO(PublicKey publicKey, PublicKey publicKey2, PrivateKey privateKey) {
        this.f115265OooO00o = publicKey;
        this.f115266OooO0O0 = publicKey2;
        this.f115267OooO0OO = privateKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32141OooO0oO)) {
            return false;
        }
        C32141OooO0oO c32141OooO0oO = (C32141OooO0oO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115265OooO00o, c32141OooO0oO.f115265OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115266OooO0O0, c32141OooO0oO.f115266OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115267OooO0OO, c32141OooO0oO.f115267OooO0OO);
    }

    public final int hashCode() {
        return this.f115267OooO0OO.hashCode() + ((this.f115266OooO0O0.hashCode() + (this.f115265OooO00o.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EncryptionInfo(serverPublic=" + this.f115265OooO00o + ", clientPublic=" + this.f115266OooO0O0 + ", clientPrivate=" + this.f115267OooO0OO + ')';
    }
}
