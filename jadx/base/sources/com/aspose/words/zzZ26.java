package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZ26 extends zzTI {
    private MarkdownLoadOptions zzY4b;
    private zzYI zzY4e;
    private zzYH zzY4f = new zzYH();
    private com.aspose.words.internal.zzIM<zzZMZ> zzY4d = new com.aspose.words.internal.zzIM<>();
    private HashMap<String, zzZ4Y> zzY4c = new HashMap<>();

    public zzZ26() {
    }

    private static void zzU(zzYI zzyi) {
        zzZ7S zzz7s = (zzZ7S) com.aspose.words.internal.zzZKW.zzZ(zzyi, zzZ7S.class);
        if (zzz7s != null) {
            zzz7s.zz0P();
            return;
        }
        zzTI zzti = (zzTI) com.aspose.words.internal.zzZKW.zzZ(zzyi, zzTI.class);
        if (zzti != null) {
            Iterator<zzYI> it = zzti.iterator();
            while (it.hasNext()) {
                zzU(it.next());
            }
        }
    }

    private void zzV(zzYI zzyi) {
        if (zzyi.zzkz() == 12 || zzyi.zzkz() == 13) {
            return;
        }
        zzY(zzyi);
    }

    private void zzYIN() {
        ArrayList arrayList = new ArrayList();
        for (zzYI zzyi : this) {
            if (zzyi.zzkz() == 14 || zzyi.zzkz() == 17) {
                zzZ7S zzz7s = (zzZ7S) zzyi;
                if (!zzz7s.isEmpty() || zzz7s.zzYUR().size() != 0) {
                    StringBuilder sb = new StringBuilder();
                    zzZ4Y zzz4y = new zzZ4Y();
                    ArrayList<String> arrayListZzYUR = zzz7s.zzYUR();
                    int i = 0;
                    int i2 = 0;
                    while (i < arrayListZzYUR.size()) {
                        if (zzz4y.zzf(com.aspose.words.internal.zzZKN.format("{0} {1}", sb, arrayListZzYUR.get(i)), 0)) {
                            com.aspose.words.internal.zzZNH.zzV(sb, arrayListZzYUR.get(i));
                            i++;
                        } else {
                            zzz4y.reset();
                            zzz4y.zzf(sb.toString(), 0);
                            sb.setLength(0);
                            if (zzz4y.isValid()) {
                                if (!this.zzY4c.containsKey(zzz4y.zzZAT())) {
                                    com.aspose.words.internal.zzZQF.zzY(this.zzY4c, zzz4y.zzZAT(), zzz4y);
                                }
                                com.aspose.words.internal.zzZQG.zzV(arrayListZzYUR, i2, 1 - i2);
                                zzz4y = new zzZ4Y();
                                i2 = 0;
                            } else {
                                i2 = i + 1;
                            }
                            i = i2;
                        }
                    }
                    if (zzz4y.isValid()) {
                        int i3 = i - 1;
                        if (!this.zzY4c.containsKey(zzz4y.zzZAT())) {
                            com.aspose.words.internal.zzZQF.zzY(this.zzY4c, zzz4y.zzZAT(), zzz4y);
                        }
                        com.aspose.words.internal.zzZQG.zzV(arrayListZzYUR, i2, (i3 - i2) + 1);
                    }
                    if (zzz7s.getCount() == 0 && zzz7s.zzYUR().size() == 0) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ7S>) arrayList, zzz7s);
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zzZ7S) it.next()).remove();
        }
    }

    private zzZ4G zzZw(String str, int i) {
        zzZ4G zzz4g = (zzZ4G) zzYy(26, 27);
        while (zzz4g != null && zzz4g.getAction() != 3) {
            if (!(zzz4g.zz9F() && zzz4g.zzYT(false) == null) && this.zzY4e.zzfa() >= zzz4g.zz7c()) {
                int iZzC = zzZ1N.zzC(str, i, zzz4g.zz7c()) + i;
                zzYI zzyiZza = this.zzY4f.zza(str, iZzC);
                this.zzY4e = zzyiZza;
                if (zzyiZza == null) {
                    throw new IllegalStateException("Cannot parse a line of text inside a list item.");
                }
                zzyiZza.zzTm(com.aspose.words.internal.zzZKN.format("{0}{1}", str.substring(i, iZzC), this.zzY4e.zz9D()));
                zzz4g.setAction(3);
                return zzz4g;
            }
            zzz4g = (zzZ4G) zzz4g.zzYC(26, 27);
        }
        return zzz4g;
    }

    public final com.aspose.words.internal.zzIM<zzZMZ> zzYIL() {
        return this.zzY4d;
    }

    public final HashMap<String, zzZ4Y> zzYIM() {
        return this.zzY4c;
    }

    public final void zzZ(com.aspose.words.internal.zzZOO zzzoo, zzZ3Z zzz3z) throws Exception {
        String line = zzzoo.readLine();
        while (true) {
            int length = 0;
            while (line != null) {
                zzz3z.zzYX(zzzoo.zzq());
                zzYI zzyiZza = this.zzY4f.zza(line, length);
                this.zzY4e = zzyiZza;
                if (zzyiZza == null) {
                    throw new IllegalStateException("Cannot parse a line of text.");
                }
                zzZ4G zzz4gZzZw = zzyiZza.zzkz() != 21 ? zzZw(line, length) : null;
                boolean zZzZ = zzZ(this.zzY4e);
                MarkdownLoadOptions markdownLoadOptions = this.zzY4b;
                if (markdownLoadOptions != null && markdownLoadOptions.getPreserveEmptyLines() && this.zzY4e.zzkz() == 12 && (zzZY2() == null || zzZY2().zzkz() != 24)) {
                    zzY(new zzYMS()).close();
                }
                if (this.zzY4e.getAction() == 2) {
                    this.zzY4f.zzy(this.zzY4e.zzkz());
                } else {
                    if (!zZzZ) {
                        zzV(this.zzY4e);
                    }
                    if (zzz4gZzZw != null) {
                        zzz4gZzZw.setAction(0);
                    }
                    this.zzY4f.zz9u();
                    length += this.zzY4e.getLength();
                    if (this.zzY4e.zzkz() == 22) {
                        this.zzY4d.add((zzZMZ) this.zzY4e);
                    }
                    if (this.zzY4e.zzkz() == 13 || this.zzY4e.zzkz() == 12) {
                        break;
                    }
                }
            }
            zzYIN();
            zzYI zzyiZzZY3 = zzZY3();
            if (zzyiZzZY3 != null && zzyiZzZY3.zzkz() == 13) {
                zzyiZzZY3.remove();
            }
            zzU(this);
            return;
            line = zzzoo.readLine();
        }
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 3;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 0;
    }

    public zzZ26(MarkdownLoadOptions markdownLoadOptions) {
        this.zzY4b = markdownLoadOptions;
    }
}
