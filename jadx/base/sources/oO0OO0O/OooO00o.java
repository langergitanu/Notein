package oO0OO0O;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import oO0O00oo.C32520OooO0oo;
import oO0O00oo.OooO;
import oO0OO0Oo.AbstractC32916OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo000;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends AbstractC32916OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f118556OooO0o = new OooO00o(1, 0, 7);

    /* JADX INFO: renamed from: oO0OO0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20272OooO00o {
        public static OooO00o OooO00o(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            OooO oooO = new OooO(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(oooO, 10));
            Iterator<Integer> it = oooO.iterator();
            while (((C32520OooO0oo) it).f116817OooOoO0) {
                ((Oooo000) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrO00oO0O = OooOo.o00oO0O(arrayList);
            return new OooO00o(Arrays.copyOf(iArrO00oO0O, iArrO00oO0O.length));
        }
    }

    static {
        new OooO00o(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        OooOOO0.OooO0oO(numbers, "numbers");
    }
}
