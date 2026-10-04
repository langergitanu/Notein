package com.google.android.gms.internal.mlkit_translate;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class zzcu extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzcn();
    zzct zza;
    int zzb;
    int zzc;
    final zzct zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzcp zzh;
    private zzcr zzi;

    public zzcu() {
        this(zze, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzf(zzct zzctVar, boolean z) {
        while (zzctVar != null) {
            zzct zzctVar2 = zzctVar.zzb;
            zzct zzctVar3 = zzctVar.zzc;
            boolean z2 = false;
            int i = zzctVar2 != null ? zzctVar2.zzi : 0;
            int i2 = zzctVar3 != null ? zzctVar3.zzi : 0;
            int i3 = i - i2;
            boolean z3 = true;
            if (i3 == -2) {
                zzct zzctVar4 = zzctVar3.zzb;
                zzct zzctVar5 = zzctVar3.zzc;
                int i4 = (zzctVar4 != null ? zzctVar4.zzi : 0) - (zzctVar5 != null ? zzctVar5.zzi : 0);
                if (i4 != -1) {
                    if (i4 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    zzi(zzctVar3);
                    zzh(zzctVar);
                    if (z3) {
                    }
                } else {
                    z2 = z;
                }
                zzh(zzctVar);
                z3 = z2;
                if (z3) {
                }
            } else if (i3 == 2) {
                zzct zzctVar6 = zzctVar2.zzb;
                zzct zzctVar7 = zzctVar2.zzc;
                int i5 = (zzctVar6 != null ? zzctVar6.zzi : 0) - (zzctVar7 != null ? zzctVar7.zzi : 0);
                if (i5 != 1) {
                    if (i5 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    zzh(zzctVar2);
                    zzi(zzctVar);
                    if (z3) {
                    }
                } else {
                    z2 = z;
                }
                zzi(zzctVar);
                z3 = z2;
                if (z3) {
                }
            } else if (i3 == 0) {
                zzctVar.zzi = i + 1;
                if (z) {
                    return;
                }
            } else {
                zzctVar.zzi = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            zzctVar = zzctVar.zza;
        }
    }

    private final void zzg(zzct zzctVar, zzct zzctVar2) {
        zzct zzctVar3 = zzctVar.zza;
        zzctVar.zza = null;
        if (zzctVar2 != null) {
            zzctVar2.zza = zzctVar3;
        }
        if (zzctVar3 == null) {
            this.zza = zzctVar2;
        } else if (zzctVar3.zzb == zzctVar) {
            zzctVar3.zzb = zzctVar2;
        } else {
            zzctVar3.zzc = zzctVar2;
        }
    }

    private final void zzh(zzct zzctVar) {
        zzct zzctVar2 = zzctVar.zzb;
        zzct zzctVar3 = zzctVar.zzc;
        zzct zzctVar4 = zzctVar3.zzb;
        zzct zzctVar5 = zzctVar3.zzc;
        zzctVar.zzc = zzctVar4;
        if (zzctVar4 != null) {
            zzctVar4.zza = zzctVar;
        }
        zzg(zzctVar, zzctVar3);
        zzctVar3.zzb = zzctVar;
        zzctVar.zza = zzctVar3;
        int iMax = Math.max(zzctVar2 != null ? zzctVar2.zzi : 0, zzctVar4 != null ? zzctVar4.zzi : 0) + 1;
        zzctVar.zzi = iMax;
        zzctVar3.zzi = Math.max(iMax, zzctVar5 != null ? zzctVar5.zzi : 0) + 1;
    }

    private final void zzi(zzct zzctVar) {
        zzct zzctVar2 = zzctVar.zzb;
        zzct zzctVar3 = zzctVar.zzc;
        zzct zzctVar4 = zzctVar2.zzb;
        zzct zzctVar5 = zzctVar2.zzc;
        zzctVar.zzb = zzctVar5;
        if (zzctVar5 != null) {
            zzctVar5.zza = zzctVar;
        }
        zzg(zzctVar, zzctVar2);
        zzctVar2.zzc = zzctVar;
        zzctVar.zza = zzctVar2;
        int iMax = Math.max(zzctVar3 != null ? zzctVar3.zzi : 0, zzctVar5 != null ? zzctVar5.zzi : 0) + 1;
        zzctVar.zzi = iMax;
        zzctVar2.zzi = Math.max(iMax, zzctVar4 != null ? zzctVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzct zzctVar = this.zzd;
        zzctVar.zze = zzctVar;
        zzctVar.zzd = zzctVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzc(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzcp zzcpVar = this.zzh;
        if (zzcpVar != null) {
            return zzcpVar;
        }
        zzcp zzcpVar2 = new zzcp(this);
        this.zzh = zzcpVar2;
        return zzcpVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzct zzctVarZzc = zzc(obj);
        if (zzctVarZzc != null) {
            return zzctVarZzc.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzcr zzcrVar = this.zzi;
        if (zzcrVar != null) {
            return zzcrVar;
        }
        zzcr zzcrVar2 = new zzcr(this);
        this.zzi = zzcrVar2;
        return zzcrVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzct zzctVarZza = zza(obj, true);
        Object obj3 = zzctVarZza.zzh;
        zzctVarZza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzct zzctVarZzd = zzd(obj);
        if (zzctVarZzd != null) {
            return zzctVarZzd.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    public final zzct zza(Object obj, boolean z) {
        int iCompareTo;
        zzct zzctVar;
        Comparator comparator = this.zzf;
        zzct zzctVar2 = this.zza;
        if (zzctVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zzctVar2.zzf) : comparator.compare(obj, zzctVar2.zzf);
                if (iCompareTo == 0) {
                    return zzctVar2;
                }
                zzct zzctVar3 = iCompareTo < 0 ? zzctVar2.zzb : zzctVar2.zzc;
                if (zzctVar3 == null) {
                    break;
                }
                zzctVar2 = zzctVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i = iCompareTo;
        if (!z) {
            return null;
        }
        zzct zzctVar4 = this.zzd;
        if (zzctVar2 != null) {
            zzct zzctVar5 = zzctVar2;
            zzctVar = new zzct(this.zzg, zzctVar5, obj, zzctVar4, zzctVar4.zze);
            if (i < 0) {
                zzctVar5.zzb = zzctVar;
            } else {
                zzctVar5.zzc = zzctVar;
            }
            zzf(zzctVar5, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzctVar = new zzct(this.zzg, null, obj, zzctVar4, zzctVar4.zze);
            this.zza = zzctVar;
        }
        this.zzb++;
        this.zzc++;
        return zzctVar;
    }

    public final zzct zzb(Map.Entry entry) {
        zzct zzctVarZzc = zzc(entry.getKey());
        if (zzctVarZzc == null || !Objects.equals(zzctVarZzc.zzh, entry.getValue())) {
            return null;
        }
        return zzctVarZzc;
    }

    public final zzct zzc(Object obj) {
        if (obj != null) {
            try {
                return zza(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final zzct zzd(Object obj) {
        zzct zzctVarZzc = zzc(obj);
        if (zzctVarZzc != null) {
            zze(zzctVarZzc, true);
        }
        return zzctVarZzc;
    }

    public final void zze(zzct zzctVar, boolean z) {
        zzct zzctVar2;
        zzct zzctVar3;
        int i;
        if (z) {
            zzct zzctVar4 = zzctVar.zze;
            zzctVar4.zzd = zzctVar.zzd;
            zzctVar.zzd.zze = zzctVar4;
        }
        zzct zzctVar5 = zzctVar.zzb;
        zzct zzctVar6 = zzctVar.zzc;
        zzct zzctVar7 = zzctVar.zza;
        int i2 = 0;
        if (zzctVar5 == null || zzctVar6 == null) {
            if (zzctVar5 != null) {
                zzg(zzctVar, zzctVar5);
                zzctVar.zzb = null;
            } else if (zzctVar6 != null) {
                zzg(zzctVar, zzctVar6);
                zzctVar.zzc = null;
            } else {
                zzg(zzctVar, null);
            }
            zzf(zzctVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzctVar5.zzi > zzctVar6.zzi) {
            do {
                zzctVar3 = zzctVar5;
                zzctVar5 = zzctVar5.zzc;
            } while (zzctVar5 != null);
        } else {
            do {
                zzctVar2 = zzctVar6;
                zzctVar6 = zzctVar6.zzb;
            } while (zzctVar6 != null);
            zzctVar3 = zzctVar2;
        }
        zze(zzctVar3, false);
        zzct zzctVar8 = zzctVar.zzb;
        if (zzctVar8 != null) {
            i = zzctVar8.zzi;
            zzctVar3.zzb = zzctVar8;
            zzctVar8.zza = zzctVar3;
            zzctVar.zzb = null;
        } else {
            i = 0;
        }
        zzct zzctVar9 = zzctVar.zzc;
        if (zzctVar9 != null) {
            i2 = zzctVar9.zzi;
            zzctVar3.zzc = zzctVar9;
            zzctVar9.zza = zzctVar3;
            zzctVar.zzc = null;
        }
        zzctVar3.zzi = Math.max(i, i2) + 1;
        zzg(zzctVar, zzctVar3);
    }

    public zzcu(Comparator comparator, boolean z) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z;
        this.zzd = new zzct(z);
    }

    public zzcu(boolean z) {
        this(zze, false);
    }
}
