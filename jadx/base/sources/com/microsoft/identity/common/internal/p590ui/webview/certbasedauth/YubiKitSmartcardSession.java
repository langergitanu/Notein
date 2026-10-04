package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.logging.Logger;
import com.yubico.yubikit.core.smartcard.C23923OooO0oO;
import com.yubico.yubikit.core.smartcard.OooO0O0;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import o0oooooO.AbstractC31890OooO0o;
import o0oooooO.C31888OooO0OO;
import oO00000.C31906OooO0Oo;
import oO00000o.C31909OooO0o0;
import oO00000o.OooO0o;
import oO0000O.C31924OooOoO;
import oO0000O.OooOo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public class YubiKitSmartcardSession implements ISmartcardSession {
    private static final short APDU_EXCEPTION_ERROR_CODE_FILE_NOT_FOUND = 27266;
    private static final String TAG = "YubiKitSmartcardSession";
    private static final String YUBIKEY_PROVIDER = "YKPiv";
    private final C31909OooO0o0 piv;

    public YubiKitSmartcardSession(C31909OooO0o0 c31909OooO0o0) {
        this.piv = c31909OooO0o0;
    }

    private void getAndPutCertDetailsInList(OooO0o oooO0o, C31909OooO0o0 c31909OooO0o0, List<ICertDetails> list) throws C31888OooO0OO, OooO0O0, IOException {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getAndPutCertDetailsInList");
        try {
            list.add(new YubiKitCertDetails(c31909OooO0o0.OooOOo0(oooO0o), oooO0o));
        } catch (OooO0O0 e) {
            if (e.f80297OooOo0o != 27266) {
                throw e;
            }
            Logger.verbose(strOooO0OO, oooO0o + " slot is empty.");
        }
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.ISmartcardSession
    public List<ICertDetails> getCertDetailsList() throws C31888OooO0OO, OooO0O0, IOException {
        ArrayList arrayList = new ArrayList();
        getAndPutCertDetailsInList(OooO0o.AUTHENTICATION, this.piv, arrayList);
        getAndPutCertDetailsInList(OooO0o.SIGNATURE, this.piv, arrayList);
        getAndPutCertDetailsInList(OooO0o.KEY_MANAGEMENT, this.piv, arrayList);
        getAndPutCertDetailsInList(OooO0o.CARD_AUTH, this.piv, arrayList);
        return arrayList;
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.ISmartcardSession
    public PrivateKey getKeyForAuth(ICertDetails iCertDetails, char[] cArr) throws Exception {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getKeyForAuth");
        if (!(iCertDetails instanceof YubiKitCertDetails)) {
            throw new Exception("certDetails is not of type YubiKitCertDetails.");
        }
        final C31909OooO0o0 c31909OooO0o0 = this.piv;
        KeyStore keyStore = KeyStore.getInstance(YUBIKEY_PROVIDER, new C31924OooOoO(new oO00000.OooO00o() { // from class: oO0000O.OooOoO0
            @Override // oO00000.OooO00o
            public final void invoke(Object obj) {
                ((oO00000.OooO00o) obj).invoke(new C31906OooO0Oo(c31909OooO0o0, null));
            }
        }));
        keyStore.load(null);
        Key key = keyStore.getKey(Integer.toString(((YubiKitCertDetails) iCertDetails).getSlot().f113763OooOo0o, 16), cArr);
        if (key instanceof OooOo) {
            return (OooOo) key;
        }
        Logger.error(strOooO0OO, "Private key retrieved from YKPiv keystore is not of type PivPrivateKey.", null);
        throw new Exception("Private key retrieved from YKPiv keystore is not of type PivPrivateKey.");
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.ISmartcardSession
    public int getPinAttemptsRemaining() throws OooO0O0, IOException {
        C31909OooO0o0 c31909OooO0o0 = this.piv;
        c31909OooO0o0.getClass();
        InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = C31909OooO0o0.f113771Oooo00O;
        interfaceC34352OooO0O0.OooOOo("Getting PIN attempts");
        AbstractC31890OooO0o.OooO00o oooO00o = C31909OooO0o0.f113766OooOoo;
        boolean zOooO0O0 = oooO00o.OooO0O0(c31909OooO0o0.f113772OooOo);
        C23923OooO0oO c23923OooO0oO = c31909OooO0o0.f113773OooOo0o;
        if (zOooO0O0) {
            interfaceC34352OooO0O0.OooOOo("Getting PIN metadata");
            c31909OooO0o0.OooO00o(oooO00o);
            LinkedHashMap linkedHashMapOooO00o = oO00000.OooO0o.OooO00o(c23923OooO0oO.OooO0OO(new com.yubico.yubikit.core.smartcard.OooO00o(-9, 0, -128, null)));
            byte[] bArr = (byte[]) linkedHashMapOooO00o.get(6);
            byte b = ((byte[]) linkedHashMapOooO00o.get(5))[0];
            byte b2 = bArr[0];
            return bArr[1];
        }
        try {
            c23923OooO0oO.OooO0OO(new com.yubico.yubikit.core.smartcard.OooO00o(32, 0, -128, null));
            interfaceC34352OooO0O0.OooOOo("Using cached value, may be incorrect");
            return c31909OooO0o0.f113774OooOoO0;
        } catch (OooO0O0 e) {
            int iOooOOoo = c31909OooO0o0.OooOOoo(e.f80297OooOo0o);
            if (iOooOOoo < 0) {
                throw e;
            }
            c31909OooO0o0.f113774OooOoO0 = iOooOOoo;
            interfaceC34352OooO0O0.OooOOo("Using value from empty verify");
            return iOooOOoo;
        }
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.ISmartcardSession
    public boolean verifyPin(char[] cArr) throws OooO0O0, IOException {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":verifyPin");
        try {
            this.piv.ooOO(cArr);
            return true;
        } catch (oO00000o.OooO0O0 unused) {
            Logger.info(strOooO0OO, "Incorrect PIN entered.");
            return false;
        }
    }
}
