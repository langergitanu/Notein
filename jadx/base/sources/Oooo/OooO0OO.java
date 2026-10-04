package Oooo;

import Oooo0.C20856OooooOo;
import Oooo0oO.o0Oo0oo;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0O0OO.InterfaceC32595OooO0Oo;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0o0O.C32724OooO0oo;
import oO0O0oOO.C32761OooO00o;
import oO0O0oo0.C32784OooO0o0;
import oO0OOOo.C32995OooOOO0;
import oO0OoO0.InterfaceC33242OooOOo0;
import oO0OooO0.C33479OooO0o;
import oO0o0Ooo.C33839OooOo0;

/* JADX INFO: loaded from: classes.dex */
public class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f59753OooO00o = 0;

    public static /* synthetic */ void OooO(int[] iArr, int[] iArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = iArr.length;
        }
        OooO0oO(iArr, iArr2, 0, 0, i);
    }

    public static /* synthetic */ void OooO00o(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static final void OooO0O0(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(C20856OooooOo.OooO0O0("Index ", i, " is out of bounds. The list has ", " elements.", size));
        }
    }

    public static final void OooO0OO(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", ").", i2));
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(o0Oo0oo.OooO0O0(i, "fromIndex (", ") is less than 0."));
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }

    public static List OooO0Oo(Object[] objArr) {
        OooOOO0.OooO0oO(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        OooOOO0.OooO0o(listAsList, "asList(...)");
        return listAsList;
    }

    public static void OooO0o(char[] cArr, int i, int i2, char[] cArr2, int i3) {
        OooOOO0.OooO0oO(cArr, "<this>");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void OooO0o0(int i, int i2, int i3, byte[] bArr, byte[] destination) {
        OooOOO0.OooO0oO(bArr, "<this>");
        OooOOO0.OooO0oO(destination, "destination");
        System.arraycopy(bArr, i2, destination, i, i3 - i2);
    }

    public static void OooO0oO(int[] iArr, int[] destination, int i, int i2, int i3) {
        OooOOO0.OooO0oO(iArr, "<this>");
        OooOOO0.OooO0oO(destination, "destination");
        System.arraycopy(iArr, i2, destination, i, i3 - i2);
    }

    public static void OooO0oo(Object[] objArr, int i, Object[] destination, int i2, int i3) {
        OooOOO0.OooO0oO(objArr, "<this>");
        OooOOO0.OooO0oO(destination, "destination");
        System.arraycopy(objArr, i2, destination, i, i3 - i2);
    }

    public static /* synthetic */ void OooOO0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        OooO0oo(objArr, 0, objArr2, i, i2);
    }

    public static byte[] OooOO0O(byte[] bArr, int i, int i2) {
        OooOOO0.OooO0oO(bArr, "<this>");
        OooOOO(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        OooOOO0.OooO0o(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static float[] OooOO0o(float[] fArr, int i, int i2) {
        OooOOO(i2, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i, i2);
        OooOOO0.OooO0o(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static final void OooOOO(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(C20856OooooOo.OooO0O0("toIndex (", i, ") is greater than size (", ").", i2));
        }
    }

    public static Object[] OooOOO0(Object[] objArr, int i, int i2) {
        OooOOO0.OooO0oO(objArr, "<this>");
        OooOOO(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        OooOOO0.OooO0o(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void OooOOOO(Object[] objArr, C33839OooOo0 c33839OooOo0, int i, int i2) {
        OooOOO0.OooO0oO(objArr, "<this>");
        Arrays.fill(objArr, i, i2, c33839OooOo0);
    }

    public static void OooOOOo(long[] jArr) {
        int length = jArr.length;
        OooOOO0.OooO0oO(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static InterfaceC32641OooooOO OooOOo(C33479OooO0o c33479OooO0o, InterfaceC32596OooO0o0 interfaceC32596OooO0o0) {
        if (c33479OooO0o == null) {
            OooO00o(19);
            throw null;
        }
        if (interfaceC32596OooO0o0 == null) {
            OooO00o(20);
            throw null;
        }
        Collection<InterfaceC32595OooO0Oo> collectionOooOO0 = interfaceC32596OooO0o0.OooOO0();
        if (collectionOooOO0.size() != 1) {
            return null;
        }
        for (InterfaceC32641OooooOO interfaceC32641OooooOO : collectionOooOO0.iterator().next().OooO0o()) {
            if (interfaceC32641OooooOO.getName().equals(c33479OooO0o)) {
                return interfaceC32641OooooOO;
            }
        }
        return null;
    }

    public static byte[] OooOOoo(byte[] bArr, byte[] elements) {
        OooOOO0.OooO0oO(bArr, "<this>");
        OooOOO0.OooO0oO(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        OooOOO0.OooO0Oo(bArrCopyOf);
        return bArrCopyOf;
    }

    public static LinkedHashSet OooOo0(C33479OooO0o c33479OooO0o, AbstractCollection abstractCollection, Collection collection, InterfaceC32596OooO0o0 interfaceC32596OooO0o0, InterfaceC33242OooOOo0 interfaceC33242OooOOo0, C32995OooOOO0 c32995OooOOO0) {
        if (c33479OooO0o == null) {
            OooO00o(0);
            throw null;
        }
        if (interfaceC32596OooO0o0 == null) {
            OooO00o(3);
            throw null;
        }
        if (interfaceC33242OooOOo0 == null) {
            OooO00o(4);
            throw null;
        }
        if (c32995OooOOO0 != null) {
            return OooOo00(c33479OooO0o, abstractCollection, collection, interfaceC32596OooO0o0, interfaceC33242OooOOo0, c32995OooOOO0, false);
        }
        OooO00o(5);
        throw null;
    }

    public static LinkedHashSet OooOo00(C33479OooO0o c33479OooO0o, Collection collection, Collection collection2, InterfaceC32596OooO0o0 interfaceC32596OooO0o0, InterfaceC33242OooOOo0 interfaceC33242OooOOo0, C32995OooOOO0 c32995OooOOO0, boolean z) {
        if (c33479OooO0o == null) {
            OooO00o(12);
            throw null;
        }
        if (collection == null) {
            OooO00o(13);
            throw null;
        }
        if (interfaceC32596OooO0o0 == null) {
            OooO00o(15);
            throw null;
        }
        if (interfaceC33242OooOOo0 == null) {
            OooO00o(16);
            throw null;
        }
        if (c32995OooOOO0 == null) {
            OooO00o(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c32995OooOOO0.OooO0oo(c33479OooO0o, collection, collection2, interfaceC32596OooO0o0, new C32761OooO00o(interfaceC33242OooOOo0, linkedHashSet, z));
        return linkedHashSet;
    }

    public static LinkedHashSet OooOo0O(C33479OooO0o c33479OooO0o, Collection collection, AbstractCollection abstractCollection, C32784OooO0o0 c32784OooO0o0, C32724OooO0oo c32724OooO0oo, C32995OooOOO0 c32995OooOOO0) {
        if (c33479OooO0o == null) {
            OooO00o(6);
            throw null;
        }
        if (collection == null) {
            OooO00o(7);
            throw null;
        }
        if (c32784OooO0o0 == null) {
            OooO00o(9);
            throw null;
        }
        if (c32724OooO0oo == null) {
            OooO00o(10);
            throw null;
        }
        if (c32995OooOOO0 != null) {
            return OooOo00(c33479OooO0o, collection, abstractCollection, c32784OooO0o0, c32724OooO0oo, c32995OooOOO0, true);
        }
        OooO00o(11);
        throw null;
    }
}
