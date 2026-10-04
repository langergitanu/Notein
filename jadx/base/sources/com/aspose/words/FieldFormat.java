package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefBoolean;
import com.aspose.words.ref.RefDouble;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldFormat {
    private GeneralFormatCollection zzYE2;
    private Field zzZz7;

    public static class zzZ implements zzZAJ {
        private int zzYE1;

        private zzZ() {
        }

        @Override // com.aspose.words.zzZAJ
        public final int zzDl(int i) {
            if (i == 5 || i == 6 || i == 7) {
                return 0;
            }
            return i;
        }

        @Override // com.aspose.words.zzZAJ
        public final int zzDm(int i) {
            return this.zzYE1;
        }

        @Override // com.aspose.words.zzZAJ
        public final void zzDn(int i) {
            this.zzYE1 = i;
        }

        @Override // com.aspose.words.zzZAJ
        public final boolean zzYZ(char c) {
            return this.zzYE1 != 0;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public FieldFormat(Field field) {
        this.zzZz7 = field;
    }

    private static char zzDo(int i) {
        if (i == 0) {
            return '-';
        }
        if (i == 1) {
            return FilenameUtils.EXTENSION_SEPARATOR;
        }
        if (i == 2) {
            return ':';
        }
        if (i == 3) {
            return (char) 8212;
        }
        if (i == 4) {
            return (char) 8211;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: separator");
    }

    private String zzU(Section section) throws Exception {
        Paragraph paragraphZzZ;
        if (section.zzYvR().zzYcs() == 0 || (paragraphZzZ = zzWB.zzZ(this.zzZz7, section)) == null) {
            return null;
        }
        return zzZ4D.zzZ(paragraphZzZ.getListLabel().zzYOC(), new zzZ((byte) 0));
    }

    private boolean zzW(zzTL zztl, Ref<zzYIU> ref) throws Exception {
        ref.set(null);
        RefDouble refDouble = new RefDouble(0.0d);
        boolean zZzZ = zztl.zzZ(refDouble);
        double d = refDouble.get();
        boolean z = false;
        if (!zZzZ) {
            return false;
        }
        Section sectionZzZgB = this.zzZz7.zzZgB();
        if (sectionZzZgB != null) {
            ref.set(zzYIU.zzCI(zzYTW.zzM((int) d, sectionZzZgB.zzYvR().zzYcw(), false)));
            String strZzU = zzU(sectionZzZgB);
            z = true;
            if (com.aspose.words.internal.zzZYD.zzXk(strZzU)) {
                ref.set(new zzYIS(strZzU.length() + 1 + ref.get().getLength()).zzT(strZzU, new zzYEF()).zzV(zzDo(sectionZzZgB.zzYvR().zzYcv()), new zzYEF()).zzV(ref.get()).zzYkq());
            }
        }
        return z;
    }

    private boolean zzX(zzTL zztl, Ref<zzYIU> ref) {
        int iZzZ5i;
        ref.set(null);
        RefDouble refDouble = new RefDouble(0.0d);
        boolean zZzZ = zztl.zzZ(refDouble);
        double d = refDouble.get();
        if (!zZzZ) {
            return false;
        }
        long j = (long) d;
        if (j >= 0 && (iZzZ5i = getGeneralFormats().zzZ5i()) != 0) {
            IFieldResultFormatter resultFormatter = this.zzZz7.getStart().zzYBb().getFieldOptions().getResultFormatter();
            if (resultFormatter != null) {
                ref.set(zzYIU.zzCI(resultFormatter.format(d, iZzZ5i)));
                if (ref.get() != null) {
                    return true;
                }
            }
            if (iZzZ5i != 15) {
                if (iZzZ5i == 20) {
                    ref.set(zzYIU.zzCI(com.aspose.words.internal.zzZWK.zzZs(d)));
                } else if (iZzZ5i != 41) {
                    ref.set(zzYIU.zzCI(zzYTW.zzy(j, zzZLM.zzAp(iZzZ5i))));
                }
                return true;
            }
        }
        return false;
    }

    private boolean zzY(zzTL zztl, Ref<zzYIU> ref) {
        ref.set(zzYIU.zzCI(zztl.zz8W()));
        String dateTimeFormat = getDateTimeFormat();
        boolean z = dateTimeFormat != null;
        if (!z) {
            dateTimeFormat = this.zzZz7.zzZgA();
        }
        if (dateTimeFormat == null) {
            return false;
        }
        String strZzZ = zztl.zzZ(dateTimeFormat, this.zzZz7.zzZgq().zzZfA(), z ? this.zzZz7.getStart().zzYBb().getFieldOptions().getResultFormatter() : null);
        if (strZzZ == null) {
            return false;
        }
        ref.set(zzYIU.zzCI(strZzZ));
        return true;
    }

    private zzYIU zzZdY() {
        return this.zzZz7.zzZgq().zzMf("\\#");
    }

    public String getDateTimeFormat() {
        return this.zzZz7.zzZgq().zzt("\\@", false);
    }

    public GeneralFormatCollection getGeneralFormats() {
        GeneralFormatCollection generalFormatCollection = this.zzYE2;
        if (generalFormatCollection != null) {
            return generalFormatCollection;
        }
        GeneralFormatCollection generalFormatCollection2 = new GeneralFormatCollection(this.zzZz7.zzZgq());
        this.zzYE2 = generalFormatCollection2;
        return generalFormatCollection2;
    }

    public String getNumericFormat() {
        return this.zzZz7.zzZgq().zzt("\\#", false);
    }

    public void setDateTimeFormat(String str) throws Exception {
        this.zzZz7.zzZgq().zzZf("\\@", str);
    }

    public void setNumericFormat(String str) throws Exception {
        this.zzZz7.zzZgq().zzZf("\\#", str);
    }

    public final boolean zzZ(zzTL zztl, Ref<zzZQ8> ref) throws Exception {
        boolean zZzY;
        Ref<zzYIU> ref2 = new Ref<>(null);
        RefBoolean refBoolean = new RefBoolean(false);
        boolean z = zzX(zztl, ref2) || zzZ(zztl, ref2, refBoolean) || zzW(zztl, ref2);
        zzYIU zzyiuZzY = ref2.get();
        boolean z2 = refBoolean.get();
        if (z) {
            zZzY = false;
        } else {
            ref2.set(zzyiuZzY);
            zZzY = zzY(zztl, ref2);
            zzyiuZzY = ref2.get();
            if (zZzY) {
                zzyiuZzY = zzY(zzyiuZzY);
            }
        }
        ref2.set(zzyiuZzY);
        boolean zZzZ = zzZ(zzyiuZzY, ref2);
        zzYIU zzyiu = ref2.get();
        ref.set(zzyiu != null ? new zzZQ8(zzyiu, z2) : null);
        return z || zZzY || zZzZ;
    }

    public final zzZB0 zzZdZ() {
        zzTV zztv = new zzTV();
        for (int count = getGeneralFormats().getCount() - 1; count >= 0; count--) {
            int i = getGeneralFormats().get(count);
            if (i == 53) {
                zztv.zzZ(new zzWA(this.zzZz7));
            } else if (i == 54) {
                zztv.zzZ(new zzYZE(this.zzZz7));
            }
        }
        if (zztv.isEmpty()) {
            zzZB0 zzzb0 = (zzZB0) com.aspose.words.internal.zzZKW.zzZ(this.zzZz7, zzZB0.class);
            if (zzzb0 != null) {
                zztv.zzY(zzzb0);
            } else if (!zzZOO.zzh(this.zzZz7) && com.aspose.words.internal.zzZKN.zzU3(getNumericFormat())) {
                zztv.zzY(new zzWA(this.zzZz7));
            }
        }
        if (zzZOO.zzCy(this.zzZz7.getType())) {
            zztv.zzY(zzYWM.zzXVW);
        }
        return zztv;
    }

    private zzYIU zzY(zzYIU zzyiu) {
        if (!zzYIT.zzW(zzyiu) && com.aspose.words.internal.zzZYD.zzXk(zzZLM.zzAr(getGeneralFormats().zzZ5i()))) {
            Ref<zzYIU> ref = new Ref<>(null);
            boolean zZzX = zzX(new zzY94(zzyiu.zzEL()), ref);
            zzYIU zzyiu2 = ref.get();
            if (zZzX) {
                return zzyiu2;
            }
        }
        return zzyiu;
    }

    private boolean zzZ(zzTL zztl, Ref<zzYIU> ref, RefBoolean refBoolean) {
        ref.set(zzYIU.zzCI(zztl.zz8W()));
        refBoolean.set(false);
        zzYIU zzyiuZzZdY = zzZdY();
        if (zzYIT.zzW(zzyiuZzZdY)) {
            return false;
        }
        zzYIU zzyiuZz2 = zzyiuZzZdY.zz2(40, 30);
        FieldOptions fieldOptions = this.zzZz7.getStart().zzYBb().getFieldOptions();
        zzZQ8 zzzq8ZzZ = zztl.zzZ(zzyiuZz2, fieldOptions.zzZcL(), fieldOptions.getResultFormatter());
        if (zzzq8ZzZ == null) {
            return false;
        }
        ref.set(zzzq8ZzZ.zzZdX());
        refBoolean.set(zzzq8ZzZ.zzZdW());
        return true;
    }

    private boolean zzZ(zzYIU zzyiu, Ref<zzYIU> ref) {
        ref.set(zzyiu);
        IFieldResultFormatter resultFormatter = this.zzZz7.getStart().zzYBb().getFieldOptions().getResultFormatter();
        Iterator<Integer> it = getGeneralFormats().iterator();
        boolean z = false;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            int iZzAo = zzZLM.zzAo(iIntValue);
            if (iZzAo != 0) {
                ref.set(zzZ(ref.get(), iIntValue, iZzAo, resultFormatter));
                z = true;
            }
        }
        return z;
    }

    private static zzYIU zzZ(zzYIU zzyiu, int i, int i2, IFieldResultFormatter iFieldResultFormatter) {
        String str;
        if (iFieldResultFormatter != null && (str = iFieldResultFormatter.format(zzyiu.zzEL(), i)) != null) {
            return zzYIU.zzCI(str);
        }
        return zzYIQ.zzZ(zzyiu, i2);
    }
}
