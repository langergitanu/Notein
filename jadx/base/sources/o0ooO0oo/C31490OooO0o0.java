package o0ooO0oo;

import androidx.appcompat.widget.C21532OooOOo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import o0ooO0Oo.C31438OooO0o0;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31445OooOOO0;
import o0ooO0Oo.C31448OooOOo;

/* JADX INFO: renamed from: o0ooO0oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31490OooO0o0 extends AbstractC31485OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f112660OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f112661OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f112662OooO0oO;

    public C31490OooO0o0(C31448OooOOo c31448OooOOo, C31438OooO0o0 c31438OooO0o0) throws IOException {
        super(new C31488OooO0Oo(c31448OooOOo.o000o00O()));
        this.f112661OooO0o0 = null;
        this.f112627OooO0OO = c31438OooO0o0;
        int iO000O00O = c31448OooOOo.o000O00O(C31441OooOO0.f112357o000oo0, null, -1);
        this.f112660OooO0o = iO000O00O;
        if (iO000O00O == -1) {
            throw new IOException("/N entry missing in object stream");
        }
        if (iO000O00O < 0) {
            throw new IOException(C21532OooOOo.OooO0OO(iO000O00O, "Illegal /N entry in object stream: "));
        }
        int iO000O00O2 = c31448OooOOo.o000O00O(C31441OooOO0.f112297o0000Oo0, null, -1);
        this.f112662OooO0oO = iO000O00O2;
        if (iO000O00O2 == -1) {
            throw new IOException("/First entry missing in object stream");
        }
        if (iO000O00O2 < 0) {
            throw new IOException(C21532OooOOo.OooO0OO(iO000O00O2, "Illegal /First entry in object stream: "));
        }
    }

    public final void OooOo0O() throws IOException {
        InterfaceC31494OooOO0O interfaceC31494OooOO0O = this.f112626OooO0O0;
        try {
            TreeMap treeMap = new TreeMap();
            long position = interfaceC31494OooOO0O.getPosition();
            int i = this.f112662OooO0oO;
            long j = (position + ((long) i)) - 1;
            for (int i2 = 0; i2 < this.f112660OooO0o && interfaceC31494OooOO0O.getPosition() < j; i2++) {
                treeMap.put(Integer.valueOf((int) OooOOo0()), Long.valueOf(OooOOo()));
            }
            this.f112661OooO0o0 = new ArrayList(treeMap.size());
            for (Map.Entry entry : treeMap.entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                long position2 = interfaceC31494OooOO0O.getPosition();
                int i3 = iIntValue + i;
                if (i3 > 0 && position2 < i3) {
                    interfaceC31494OooOO0O.OooO0oo(i3 - ((int) position2));
                }
                C31445OooOOO0 c31445OooOOO0 = new C31445OooOOO0(OooOO0o());
                c31445OooOOO0.f112468OooOoO = 0;
                c31445OooOOO0.f112469OooOoO0 = ((Long) entry.getValue()).longValue();
                this.f112661OooO0o0.add(c31445OooOOO0);
            }
        } finally {
            interfaceC31494OooOO0O.close();
        }
    }
}
