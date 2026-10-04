package o0oo0oo;

import android.util.Log;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: o0oo0oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31366OooO0oo extends AbstractC31358OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f111997OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f111998OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C31378OooOOOo f111999OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f112000OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f112001OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f112002OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f112003OooO0oo;

    public C31366OooO0oo(AbstractC31397Oooo0O0 abstractC31397Oooo0O0, C31378OooOOOo c31378OooOOOo) throws IOException {
        short s;
        super((short) -1);
        this.f111997OooO0O0 = new ArrayList();
        this.f111998OooO0OO = new HashMap();
        this.f112001OooO0o0 = false;
        this.f112000OooO0o = false;
        this.f112002OooO0oO = -1;
        this.f112003OooO0oo = -1;
        this.f111999OooO0Oo = c31378OooOOOo;
        do {
            C31365OooO0oO c31365OooO0oO = new C31365OooO0oO(abstractC31397Oooo0O0);
            this.f111997OooO0O0.add(c31365OooO0oO);
            s = c31365OooO0oO.f111991OooO0o0;
        } while ((s & 32) != 0);
        if ((s & 256) != 0) {
            abstractC31397Oooo0O0.Oooo0(abstractC31397Oooo0O0.ooOO());
        }
        Iterator it = this.f111997OooO0O0.iterator();
        while (it.hasNext()) {
            try {
                int i = ((C31365OooO0oO) it.next()).f111990OooO0o;
                C31368OooOO0O c31368OooOO0OOooO0O0 = this.f111999OooO0Oo.OooO0O0(i);
                if (c31368OooOO0OOooO0O0 != null) {
                    this.f111998OooO0OO.put(Integer.valueOf(i), c31368OooOO0OOooO0O0.f112011OooO0OO);
                }
            } catch (IOException e) {
                Log.e("PdfBox-Android", e.getMessage(), e);
            }
        }
    }

    public final C31365OooO0oO OooO(int i) {
        for (C31365OooO0oO c31365OooO0oO : this.f111997OooO0O0) {
            InterfaceC31369OooOO0o interfaceC31369OooOO0o = (InterfaceC31369OooOO0o) this.f111998OooO0OO.get(Integer.valueOf(c31365OooO0oO.f111990OooO0o));
            int i2 = c31365OooO0oO.f111986OooO00o;
            if (i2 <= i && interfaceC31369OooOO0o != null && i < interfaceC31369OooOO0o.OooO0o0() + i2) {
                return c31365OooO0oO;
            }
        }
        return null;
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final boolean OooO00o() {
        return true;
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final short OooO0O0(int i) {
        C31365OooO0oO c31365OooO0oOOooO = OooO(i);
        if (c31365OooO0oOOooO == null) {
            return (short) 0;
        }
        InterfaceC31369OooOO0o interfaceC31369OooOO0o = (InterfaceC31369OooOO0o) this.f111998OooO0OO.get(Integer.valueOf(c31365OooO0oOOooO.f111990OooO0o));
        int i2 = i - c31365OooO0oOOooO.f111986OooO00o;
        short sOooO0o = interfaceC31369OooOO0o.OooO0o(i2);
        short sOooO0O0 = interfaceC31369OooOO0o.OooO0O0(i2);
        return (short) (((short) Math.round((float) ((((double) sOooO0O0) * c31365OooO0oOOooO.f111993OooO0oo) + (((double) sOooO0o) * c31365OooO0oOOooO.f111985OooO)))) + c31365OooO0oOOooO.f111996OooOO0o);
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final byte OooO0OO(int i) {
        C31365OooO0oO c31365OooO0oOOooO = OooO(i);
        if (c31365OooO0oOOooO != null) {
            return ((InterfaceC31369OooOO0o) this.f111998OooO0OO.get(Integer.valueOf(c31365OooO0oOOooO.f111990OooO0o))).OooO0OO(i - c31365OooO0oOOooO.f111986OooO00o);
        }
        return (byte) 0;
    }

    @Override // o0oo0oo.AbstractC31358OooO, o0oo0oo.InterfaceC31369OooOO0o
    public final void OooO0Oo() {
        if (this.f112000OooO0o) {
            return;
        }
        if (this.f112001OooO0o0) {
            Log.e("PdfBox-Android", "Circular reference in GlyfCompositeDesc");
            return;
        }
        this.f112001OooO0o0 = true;
        int iOooO0o0 = 0;
        int iOooO0oo = 0;
        for (C31365OooO0oO c31365OooO0oO : this.f111997OooO0O0) {
            c31365OooO0oO.f111986OooO00o = iOooO0o0;
            c31365OooO0oO.f111987OooO0O0 = iOooO0oo;
            InterfaceC31369OooOO0o interfaceC31369OooOO0o = (InterfaceC31369OooOO0o) this.f111998OooO0OO.get(Integer.valueOf(c31365OooO0oO.f111990OooO0o));
            if (interfaceC31369OooOO0o != null) {
                interfaceC31369OooOO0o.OooO0Oo();
                iOooO0o0 += interfaceC31369OooOO0o.OooO0o0();
                iOooO0oo += interfaceC31369OooOO0o.OooO0oo();
            }
        }
        this.f112000OooO0o = true;
        this.f112001OooO0o0 = false;
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final short OooO0o(int i) {
        C31365OooO0oO c31365OooO0oOOooO = OooO(i);
        if (c31365OooO0oOOooO == null) {
            return (short) 0;
        }
        InterfaceC31369OooOO0o interfaceC31369OooOO0o = (InterfaceC31369OooOO0o) this.f111998OooO0OO.get(Integer.valueOf(c31365OooO0oOOooO.f111990OooO0o));
        int i2 = i - c31365OooO0oOOooO.f111986OooO00o;
        short sOooO0o = interfaceC31369OooOO0o.OooO0o(i2);
        short sOooO0O0 = interfaceC31369OooOO0o.OooO0O0(i2);
        return (short) (((short) Math.round((float) ((((double) sOooO0O0) * c31365OooO0oOOooO.f111994OooOO0) + (((double) sOooO0o) * c31365OooO0oOOooO.f111992OooO0oO)))) + c31365OooO0oOOooO.f111995OooOO0O);
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final int OooO0o0() {
        if (!this.f112000OooO0o) {
            Log.e("PdfBox-Android", "getPointCount called on unresolved GlyfCompositeDescript");
        }
        if (this.f112002OooO0oO < 0) {
            C31365OooO0oO c31365OooO0oO = (C31365OooO0oO) C21505OooO0Oo.OooO00o(1, this.f111997OooO0O0);
            InterfaceC31369OooOO0o interfaceC31369OooOO0o = (InterfaceC31369OooOO0o) this.f111998OooO0OO.get(Integer.valueOf(c31365OooO0oO.f111990OooO0o));
            if (interfaceC31369OooOO0o == null) {
                Log.e("PdfBox-Android", "GlyphDescription for index " + c31365OooO0oO.f111990OooO0o + " is null, returning 0");
                this.f112002OooO0oO = 0;
            } else {
                this.f112002OooO0oO = interfaceC31369OooOO0o.OooO0o0() + c31365OooO0oO.f111986OooO00o;
            }
        }
        return this.f112002OooO0oO;
    }

    @Override // o0oo0oo.InterfaceC31369OooOO0o
    public final int OooO0oO(int i) {
        HashMap map;
        C31365OooO0oO c31365OooO0oO;
        Iterator it = this.f111997OooO0O0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f111998OooO0OO;
            if (!zHasNext) {
                c31365OooO0oO = null;
                break;
            }
            c31365OooO0oO = (C31365OooO0oO) it.next();
            InterfaceC31369OooOO0o interfaceC31369OooOO0o = (InterfaceC31369OooOO0o) map.get(Integer.valueOf(c31365OooO0oO.f111990OooO0o));
            int i2 = c31365OooO0oO.f111987OooO0O0;
            if (i2 <= i && interfaceC31369OooOO0o != null && i < interfaceC31369OooOO0o.OooO0oo() + i2) {
                break;
            }
        }
        if (c31365OooO0oO != null) {
            return ((InterfaceC31369OooOO0o) map.get(Integer.valueOf(c31365OooO0oO.f111990OooO0o))).OooO0oO(i - c31365OooO0oO.f111987OooO0O0) + c31365OooO0oO.f111986OooO00o;
        }
        return 0;
    }

    @Override // o0oo0oo.AbstractC31358OooO, o0oo0oo.InterfaceC31369OooOO0o
    public final int OooO0oo() {
        if (!this.f112000OooO0o) {
            Log.e("PdfBox-Android", "getContourCount called on unresolved GlyfCompositeDescript");
        }
        if (this.f112003OooO0oo < 0) {
            C31365OooO0oO c31365OooO0oO = (C31365OooO0oO) C21505OooO0Oo.OooO00o(1, this.f111997OooO0O0);
            this.f112003OooO0oo = ((InterfaceC31369OooOO0o) this.f111998OooO0OO.get(Integer.valueOf(c31365OooO0oO.f111990OooO0o))).OooO0oo() + c31365OooO0oO.f111987OooO0O0;
        }
        return this.f112003OooO0oo;
    }
}
