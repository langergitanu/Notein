package com.orion.penkit.models;

import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.backup.BackupFile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OoO.C24536OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\n\u0010\t\u001a%\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m80612d2 = {"", "", BackupFile.PREFIX_NOTE_DIR, "roundToDecimals", "(FI)F", "", "Lcom/orion/penkit/models/Mask;", "newMasks", "mergeOverlappingMasks", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "mergeOverlappingMasksIncremental", "", "masks", "newMask", "LoO00ooO/OooOooO;", "insertAndMergeWithThreshold", "(Ljava/util/List;Lcom/orion/penkit/models/Mask;)V", "sorted", "mergeAlreadySorted", "(Ljava/util/List;)Ljava/util/List;", "computeUnmaskedRegions", "ni-penkit_release"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MaskKt {
    public static final List<Mask> computeUnmaskedRegions(List<Mask> list) {
        OooOOO0.OooO0oO(list, "<this>");
        if (list.isEmpty()) {
            return OooOo.OooO0oO(new Mask(0.0f, 1.0f, 3));
        }
        ArrayList arrayList = new ArrayList();
        List listO00O0O = oOo000Oo.OooOo.o00O0O(list, new Comparator() { // from class: com.orion.penkit.models.MaskKt$computeUnmaskedRegions$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C24536OooO0Oo.OooO0O0(Float.valueOf(((Mask) t).getStart()), Float.valueOf(((Mask) t2).getStart()));
            }
        });
        int i = 0;
        if (((Mask) listO00O0O.get(0)).getStart() > 0.0f) {
            arrayList.add(new Mask(0.0f, ((Mask) listO00O0O.get(0)).getStart(), ((Mask) listO00O0O.get(0)).getDecimalPlaces()));
        }
        int size = listO00O0O.size() - 1;
        while (i < size) {
            float end = ((Mask) listO00O0O.get(i)).getEnd();
            int i2 = i + 1;
            float start = ((Mask) listO00O0O.get(i2)).getStart();
            if (end < start) {
                arrayList.add(new Mask(end, start, ((Mask) listO00O0O.get(i)).getDecimalPlaces()));
            }
            i = i2;
        }
        float end2 = ((Mask) oOo000Oo.OooOo.OoooOOo(listO00O0O)).getEnd();
        if (end2 < 1.0f) {
            arrayList.add(new Mask(end2, 1.0f, ((Mask) oOo000Oo.OooOo.OoooOOo(listO00O0O)).getDecimalPlaces()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void insertAndMergeWithThreshold(List<Mask> list, Mask mask) {
        int i;
        int i2;
        if (list.isEmpty()) {
            list.add(mask);
            return;
        }
        float fPow = (float) Math.pow(10.0f, -list.get(0).getDecimalPlaces());
        final Float fValueOf = Float.valueOf(mask.getStart());
        int size = list.size();
        InterfaceC32507OooOO0o<Mask, Integer> interfaceC32507OooOO0o = new InterfaceC32507OooOO0o<Mask, Integer>() { // from class: com.orion.penkit.models.MaskKt$insertAndMergeWithThreshold$$inlined$binarySearchBy$default$1
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Integer invoke(Mask mask2) {
                return Integer.valueOf(C24536OooO0Oo.OooO0O0(Float.valueOf(mask2.getStart()), fValueOf));
            }
        };
        C34429OooOOo0.OooOOOo(list.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i = -(i4 + 1);
                break;
            }
            i = (i4 + i3) >>> 1;
            int iIntValue = interfaceC32507OooOO0o.invoke(list.get(i)).intValue();
            if (iIntValue < 0) {
                i4 = i + 1;
            } else if (iIntValue <= 0) {
                break;
            } else {
                i3 = i - 1;
            }
        }
        int i5 = i < 0 ? -(i + 1) : i + 1;
        int size2 = list.size();
        if (i5 > size2) {
            i5 = size2;
        }
        float end = mask.getEnd();
        if (i5 > 0) {
            i2 = i5 - 1;
            Mask mask2 = list.get(i2);
            if (mask2.getEnd() - (mask.getStart() - fPow) > -1.0E-7d) {
                end = Math.max(mask2.getEnd(), mask.getEnd());
            } else {
                i2 = i5;
            }
        }
        int i6 = i5;
        while (i6 < list.size()) {
            Mask mask3 = list.get(i6);
            if (end - (mask3.getStart() - fPow) <= -1.0E-7d) {
                break;
            }
            end = Math.max(end, mask3.getEnd());
            i6++;
        }
        if (i2 >= i5 && i6 <= i5) {
            list.add(i5, mask);
            return;
        }
        float start = i2 < i5 ? list.get(i2).getStart() : mask.getStart();
        int i7 = i6 - i2;
        for (int i8 = 0; i8 < i7; i8++) {
            list.remove(i2);
        }
        Mask mask4 = (Mask) oOo000Oo.OooOo.Oooo(list);
        list.add(i2, new Mask(start, end, mask4 != null ? mask4.getDecimalPlaces() : mask.getDecimalPlaces()));
    }

    private static final List<Mask> mergeAlreadySorted(List<Mask> list) {
        ArrayList arrayList = new ArrayList();
        Mask mask = list.get(0);
        float fPow = (float) Math.pow(10.0f, -mask.getDecimalPlaces());
        int size = list.size();
        Mask mask2 = mask;
        for (int i = 1; i < size; i++) {
            Mask maskCopy$default = list.get(i);
            if (mask2.getEnd() - (maskCopy$default.getStart() - fPow) > -1.0E-7d) {
                maskCopy$default = Mask.copy$default(mask2, 0.0f, Math.max(mask2.getEnd(), maskCopy$default.getEnd()), 0, 5, null);
            } else {
                arrayList.add(mask2);
            }
            mask2 = maskCopy$default;
        }
        arrayList.add(mask2);
        return arrayList;
    }

    public static final List<Mask> mergeOverlappingMasks(List<Mask> list, List<Mask> newMasks) {
        OooOOO0.OooO0oO(list, "<this>");
        OooOOO0.OooO0oO(newMasks, "newMasks");
        if (newMasks.isEmpty()) {
            return list;
        }
        List<Mask> listO00O0O = oOo000Oo.OooOo.o00O0O(oOo000Oo.OooOo.OooooOO(list, newMasks), new Comparator() { // from class: com.orion.penkit.models.MaskKt$mergeOverlappingMasks$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C24536OooO0Oo.OooO0O0(Float.valueOf(((Mask) t).getStart()), Float.valueOf(((Mask) t2).getStart()));
            }
        });
        if (listO00O0O.size() <= 1) {
            return listO00O0O;
        }
        ArrayList arrayList = new ArrayList();
        Mask mask = listO00O0O.get(0);
        float fPow = (float) Math.pow(10.0f, -mask.getDecimalPlaces());
        int size = listO00O0O.size();
        Mask mask2 = mask;
        for (int i = 1; i < size; i++) {
            Mask maskCopy$default = listO00O0O.get(i);
            if (mask2.getEnd() - (maskCopy$default.getStart() - fPow) > -1.0E-7d) {
                maskCopy$default = Mask.copy$default(mask2, 0.0f, Math.max(mask2.getEnd(), maskCopy$default.getEnd()), 0, 5, null);
            } else {
                arrayList.add(mask2);
            }
            mask2 = maskCopy$default;
        }
        arrayList.add(mask2);
        return arrayList;
    }

    public static final List<Mask> mergeOverlappingMasksIncremental(List<Mask> list, List<Mask> newMasks) {
        OooOOO0.OooO0oO(list, "<this>");
        OooOOO0.OooO0oO(newMasks, "newMasks");
        if (newMasks.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            List<Mask> listO00O0O = oOo000Oo.OooOo.o00O0O(newMasks, new Comparator() { // from class: com.orion.penkit.models.MaskKt$mergeOverlappingMasksIncremental$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C24536OooO0Oo.OooO0O0(Float.valueOf(((Mask) t).getStart()), Float.valueOf(((Mask) t2).getStart()));
                }
            });
            return listO00O0O.size() <= 1 ? listO00O0O : mergeAlreadySorted(listO00O0O);
        }
        ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(list);
        if (newMasks.size() > 1) {
            newMasks = oOo000Oo.OooOo.o00O0O(newMasks, new Comparator() { // from class: com.orion.penkit.models.MaskKt$mergeOverlappingMasksIncremental$$inlined$sortedBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C24536OooO0Oo.OooO0O0(Float.valueOf(((Mask) t).getStart()), Float.valueOf(((Mask) t2).getStart()));
                }
            });
        }
        Iterator<Mask> it = newMasks.iterator();
        while (it.hasNext()) {
            insertAndMergeWithThreshold(arrayListO0ooOoO, it.next());
        }
        return arrayListO0ooOoO;
    }

    public static final float roundToDecimals(float f, int i) {
        return ((float) Math.rint(f * ((float) Math.pow(r0, r2)))) / ((float) Math.pow(10.0f, i));
    }
}
