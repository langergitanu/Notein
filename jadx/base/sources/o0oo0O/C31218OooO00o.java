package o0oo0O;

import android.graphics.Matrix;
import androidx.appcompat.widget.C21532OooOOo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0o.AbstractC33526OooO0Oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOO0O;
import oO0o0O0o.C33599OooOo0O;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.oo0o0Oo;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0oo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31218OooO00o implements InterfaceC33911OooO0OO<Matrix> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C31218OooO00o f111340OooO00o = new C31218OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final oo0o0Oo f111341OooO0O0 = OooOO0O.OooO00o("android.graphics.Matrix", AbstractC33526OooO0Oo.OooO.f121105OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(OooO0OO oooO0OO) {
        List listOoooOO0 = C33599OooOo0O.OoooOO0(oooO0OO.OooOO0(), new String[]{","});
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOoooOO0, 10));
        Iterator it = listOoooOO0.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(Float.parseFloat((String) it.next())));
        }
        if (arrayList.size() != 9) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(arrayList.size(), "Invalid Matrix data, expected 9 floats but got ").toString());
        }
        Matrix matrix = new Matrix();
        matrix.setValues(OooOo.oo000o(arrayList));
        return matrix;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f111341OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        Matrix value = (Matrix) obj;
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        float[] fArr = new float[9];
        value.getValues(fArr);
        encoder.OooOOoo(OooOOO.Oooo0(fArr, new com.orion.notein.data.repo.transactions.OooO00o(1), 30));
    }
}
