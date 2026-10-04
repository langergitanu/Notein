package o000ooOO;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.text.TextUtils;
import androidx.fragment.app.C21904OooOoo0;
import com.facebook.soloader.OooOo;
import java.lang.annotation.Annotation;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.RejectedExecutionException;
import javax.crypto.Cipher;
import kotlin.coroutines.Continuation;
import o0000OOo.C24217OooO0O0;
import o000oo0.AbstractC24673OooOo0O;
import o000oo0.C24685Oooo00O;
import o000oo0.Oooo0;
import o000oo0.RunnableC24676OooOo0o;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o000oooO.InterfaceC24760OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0oO0.C32730OooO0Oo;
import oO0O0oO0.C32732OooO0o0;
import oO0OooO0.C33477OooO0OO;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33614OooOOO0;
import oO0o0Ooo.C33822OooO0OO;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o000ooOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24734OooO0O0 {
    public static final Cursor OooO(AbstractC24673OooOo0O db, InterfaceC24760OooO0o0 interfaceC24760OooO0o0, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(db, "db");
        db.OooO00o();
        db.OooO0O0();
        Cursor c = db.OooOO0O().OooooOO().o0ooOoO(interfaceC24760OooO0o0);
        if (z && (c instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(c, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c.getColumnNames(), c.getCount());
                    while (c.moveToNext()) {
                        Object[] objArr = new Object[c.getColumnCount()];
                        int columnCount = c.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = c.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(c.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(c.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = c.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = c.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    c.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return c;
    }

    public static byte[] OooO00o(Cipher cipher, String str) {
        SecureRandom secureRandom = new SecureRandom();
        int blockSize = cipher.getBlockSize();
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(secureRandom.nextDouble());
        }
        int i = blockSize * 2;
        byte[] bArr = new byte[i];
        byte[] bArr2 = new byte[blockSize];
        secureRandom.nextBytes(bArr2);
        for (int i2 = 1; i2 < i; i2++) {
            byte bCodePointAt = (byte) (str.codePointAt(i2 % str.length()) & 127);
            bArr[i2] = bCodePointAt;
            if (i2 >= blockSize) {
                bArr[i2] = (byte) (bArr[0] & bCodePointAt);
            }
        }
        System.arraycopy(bArr, blockSize, bArr2, 0, blockSize);
        return bArr2;
    }

    public static final void OooO0O0(InterfaceC24747OooO0O0 connection) throws Exception {
        kotlin.jvm.internal.OooOOO0.OooO0oO(connection, "connection");
        C32465OooO0O0 c32465OooO0O0OooO0Oo = OooOo.OooO0Oo();
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
            try {
                c32465OooO0O0OooO0Oo.add(interfaceC24749OooO0OoO0ooOOo.o000OoO(0));
            } finally {
            }
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        interfaceC24749OooO0OoO0ooOOo.close();
        ListIterator listIterator = OooOo.OooO0O0(c32465OooO0O0OooO0Oo).listIterator(0);
        while (true) {
            C32465OooO0O0.C20232OooO0O0 c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
            if (!c20232OooO0O0.hasNext()) {
                return;
            }
            String str = (String) c20232OooO0O0.next();
            if (C33595OooOOo.OooOoO0(str, "room_fts_content_sync_", false)) {
                C24746OooO00o.OooO0o0(connection, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final C32732OooO0o0 OooO0OO(Annotation[] annotationArr, C33477OooO0OO fqName) {
        Annotation annotation;
        kotlin.jvm.internal.OooOOO0.OooO0oO(annotationArr, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (C32730OooO0Oo.OooO00o(C24217OooO0O0.OooO0Oo(C24217OooO0O0.OooO0OO(annotation))).OooO0O0().equals(fqName)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C32732OooO0o0(annotation);
        }
        return null;
    }

    public static final ArrayList OooO0Oo(Annotation[] annotationArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C32732OooO0o0(annotation));
        }
        return arrayList;
    }

    public static final Object OooO0o(AbstractC24673OooOo0O db, boolean z, boolean z2, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(db, "db");
        db.OooO00o();
        db.OooO0O0();
        return o000oo0o.OooOo.OooO00o(new C24735OooO0OO(null, db, interfaceC32507OooOO0o, z2, z));
    }

    public static final InterfaceC34415OooO0oo OooO0o0(AbstractC24673OooOo0O abstractC24673OooOo0O, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        if (!abstractC24673OooOo0O.OooOOO()) {
            return ((C33822OooO0OO) abstractC24673OooOo0O.OooO()).f121916OooOo0o;
        }
        C24685Oooo00O c24685Oooo00O = (C24685Oooo00O) abstractC32479OooO0OO.getContext().get(C24685Oooo00O.f83653OooOoO0);
        if (c24685Oooo00O != null) {
            InterfaceC34412OooO0o interfaceC34412OooO0o = c24685Oooo00O.f83655OooOo0o;
            C33822OooO0OO c33822OooO0OO = abstractC24673OooOo0O.f83578OooO00o;
            if (c33822OooO0OO == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("coroutineScope");
                throw null;
            }
            InterfaceC34415OooO0oo interfaceC34415OooO0ooPlus = c33822OooO0OO.f121916OooOo0o.plus(interfaceC34412OooO0o);
            if (interfaceC34415OooO0ooPlus != null) {
                return interfaceC34415OooO0ooPlus;
            }
        }
        if (z) {
            InterfaceC34415OooO0oo interfaceC34415OooO0oo = abstractC24673OooOo0O.f83579OooO0O0;
            if (interfaceC34415OooO0oo != null) {
                return interfaceC34415OooO0oo;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("transactionContext");
            throw null;
        }
        C33822OooO0OO c33822OooO0OO2 = abstractC24673OooOo0O.f83578OooO00o;
        if (c33822OooO0OO2 != null) {
            return c33822OooO0OO2.f121916OooOo0o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("coroutineScope");
        throw null;
    }

    public static final Object OooO0oO(AbstractC24673OooOo0O abstractC24673OooOo0O, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        Oooo0 oooo0;
        if (!abstractC24673OooOo0O.OooOOO()) {
            return C33609OooO0oo.OooO0o(((C33822OooO0OO) abstractC24673OooOo0O.OooO()).f121916OooOo0o, new C24738OooO0o0(null, abstractC24673OooOo0O, interfaceC32507OooOO0o), abstractC32479OooO0OO);
        }
        o000oo0.OooOo oooOo = new o000oo0.OooOo(new C24736OooO0Oo(null, abstractC24673OooOo0O, interfaceC32507OooOO0o), null);
        C24685Oooo00O c24685Oooo00O = (C24685Oooo00O) abstractC32479OooO0OO.getContext().get(C24685Oooo00O.f83653OooOoO0);
        InterfaceC34412OooO0o interfaceC34412OooO0o = c24685Oooo00O != null ? c24685Oooo00O.f83655OooOo0o : null;
        if (interfaceC34412OooO0o != null) {
            return C33609OooO0oo.OooO0o(interfaceC34412OooO0o, oooOo, abstractC32479OooO0OO);
        }
        InterfaceC34415OooO0oo context = abstractC32479OooO0OO.getContext();
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(abstractC32479OooO0OO));
        c33614OooOOO0.OooOOoo();
        try {
            oooo0 = abstractC24673OooOo0O.f83581OooO0Oo;
        } catch (RejectedExecutionException e) {
            c33614OooOOO0.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        if (oooo0 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("internalTransactionExecutor");
            throw null;
        }
        oooo0.execute(new RunnableC24676OooOo0o(context, c33614OooOOO0, abstractC24673OooOo0O, oooOo));
        Object objOooOOo = c33614OooOOO0.OooOOo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooOOo;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0oo(Continuation continuation, AbstractC24673OooOo0O abstractC24673OooOo0O, InterfaceC32507OooOO0o interfaceC32507OooOO0o, boolean z, boolean z2) {
        C24739OooO0oO c24739OooO0oO;
        AbstractC24673OooOo0O abstractC24673OooOo0O2;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o2;
        boolean z3;
        boolean z4;
        if (continuation instanceof C24739OooO0oO) {
            c24739OooO0oO = (C24739OooO0oO) continuation;
            int i = c24739OooO0oO.f83916OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24739OooO0oO.f83916OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c24739OooO0oO = new C24739OooO0oO(continuation);
            }
        }
        C24739OooO0oO c24739OooO0oO2 = c24739OooO0oO;
        Object obj = c24739OooO0oO2.f83915OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24739OooO0oO2.f83916OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (abstractC24673OooOo0O.OooOOO() && abstractC24673OooOo0O.OooOOo() && abstractC24673OooOo0O.OooOOOO()) {
                C24740OooO0oo c24740OooO0oo = new C24740OooO0oo(null, abstractC24673OooOo0O, interfaceC32507OooOO0o, z2, z);
                c24739OooO0oO2.f83916OooOoo0 = 1;
                Object objOooOo00 = abstractC24673OooOo0O.OooOo00(z, c24740OooO0oo, c24739OooO0oO2);
                if (objOooOo00 != enumC32485OooO00o) {
                    return objOooOo00;
                }
            } else {
                c24739OooO0oO2.f83912OooOo0o = abstractC24673OooOo0O;
                c24739OooO0oO2.f83911OooOo = interfaceC32507OooOO0o;
                c24739OooO0oO2.f83914OooOoO0 = z;
                c24739OooO0oO2.f83913OooOoO = z2;
                c24739OooO0oO2.f83916OooOoo0 = 2;
                InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO0o0 = OooO0o0(abstractC24673OooOo0O, z2, c24739OooO0oO2);
                if (interfaceC34415OooO0ooOooO0o0 != enumC32485OooO00o) {
                    abstractC24673OooOo0O2 = abstractC24673OooOo0O;
                    interfaceC32507OooOO0o2 = interfaceC32507OooOO0o;
                    obj = interfaceC34415OooO0ooOooO0o0;
                    z3 = z2;
                    z4 = z;
                }
            }
        }
        if (i2 == 1) {
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        boolean z5 = c24739OooO0oO2.f83913OooOoO;
        boolean z6 = c24739OooO0oO2.f83914OooOoO0;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o3 = c24739OooO0oO2.f83911OooOo;
        AbstractC24673OooOo0O abstractC24673OooOo0O3 = c24739OooO0oO2.f83912OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        z3 = z5;
        z4 = z6;
        interfaceC32507OooOO0o2 = interfaceC32507OooOO0o3;
        abstractC24673OooOo0O2 = abstractC24673OooOo0O3;
        C24737OooO0o c24737OooO0o = new C24737OooO0o(null, abstractC24673OooOo0O2, interfaceC32507OooOO0o2, z4, z3);
        c24739OooO0oO2.f83912OooOo0o = null;
        c24739OooO0oO2.f83911OooOo = null;
        c24739OooO0oO2.f83916OooOoo0 = 3;
        Object objOooO0o = C33609OooO0oo.OooO0o((InterfaceC34415OooO0oo) obj, c24737OooO0o, c24739OooO0oO2);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }
}
