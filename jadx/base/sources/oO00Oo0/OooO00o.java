package oO00Oo0;

import OooO0Oo.C20398OooO0O0;
import Oooo0oO.C21023OooO0Oo;
import Ooooo0o.Oooo000;
import androidx.appcompat.widget.C21532OooOOo;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteBuffer f115944OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f115945OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f115946OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f115947OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f115948OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f115949OooO0o0;

    public OooO00o(ByteBuffer memory) {
        OooOOO0.OooO0oO(memory, "memory");
        this.f115944OooO00o = memory;
        this.f115949OooO0o0 = memory.limit();
        this.f115948OooO0o = memory.limit();
    }

    public final void OooO00o(int i) {
        int i2 = this.f115946OooO0OO;
        int i3 = i2 + i;
        if (i < 0 || i3 > this.f115949OooO0o0) {
            Oooo000.OooO0Oo(i, this.f115949OooO0o0 - i2);
            throw null;
        }
        this.f115946OooO0OO = i3;
    }

    public final void OooO0O0(int i) {
        int i2 = this.f115949OooO0o0;
        int i3 = this.f115946OooO0OO;
        if (i < i3) {
            Oooo000.OooO0Oo(i - i3, i2 - i3);
            throw null;
        }
        if (i < i2) {
            this.f115946OooO0OO = i;
        } else if (i == i2) {
            this.f115946OooO0OO = i;
        } else {
            Oooo000.OooO0Oo(i - i3, i2 - i3);
            throw null;
        }
    }

    public final void OooO0OO(int i) {
        if (i == 0) {
            return;
        }
        int i2 = this.f115945OooO0O0;
        int i3 = i2 + i;
        if (i < 0 || i3 > this.f115946OooO0OO) {
            Oooo000.OooO0o0(i, this.f115946OooO0OO - i2);
            throw null;
        }
        this.f115945OooO0O0 = i3;
    }

    public final void OooO0Oo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "newReadPosition shouldn't be negative: ").toString());
        }
        if (i > this.f115945OooO0O0) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "newReadPosition shouldn't be ahead of the read position: ", " > ");
            sbOooO0OO.append(this.f115945OooO0O0);
            throw new IllegalArgumentException(sbOooO0OO.toString().toString());
        }
        this.f115945OooO0O0 = i;
        if (this.f115947OooO0Oo > i) {
            this.f115947OooO0Oo = i;
        }
    }

    public final void OooO0o0() {
        int i = this.f115948OooO0o;
        int i2 = i - 8;
        int i3 = this.f115946OooO0OO;
        if (i2 >= i3) {
            this.f115949OooO0o0 = i2;
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "End gap 8 is too big: capacity is "));
        }
        if (i2 < this.f115947OooO0Oo) {
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" bytes reserved in the beginning", this.f115947OooO0Oo, new StringBuilder("End gap 8 is too big: there are already ")));
        }
        if (this.f115945OooO0O0 == i3) {
            this.f115949OooO0o0 = i2;
            this.f115945OooO0O0 = i2;
            this.f115946OooO0OO = i2;
        } else {
            throw new IllegalArgumentException("Unable to reserve end gap 8: there are already " + (this.f115946OooO0OO - this.f115945OooO0O0) + " content bytes at offset " + this.f115945OooO0O0);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Buffer(");
        sb.append(this.f115946OooO0OO - this.f115945OooO0O0);
        sb.append(" used, ");
        sb.append(this.f115949OooO0o0 - this.f115946OooO0OO);
        sb.append(" free, ");
        int i = this.f115947OooO0Oo;
        int i2 = this.f115949OooO0o0;
        int i3 = this.f115948OooO0o;
        sb.append((i3 - i2) + i);
        sb.append(" reserved of ");
        return C20398OooO0O0.OooO00o(')', sb, i3);
    }
}
