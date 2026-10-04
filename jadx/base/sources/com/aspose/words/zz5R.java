package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz5R {
    private boolean zzZ1I;

    public zz5R(boolean z) {
        this.zzZ1I = z;
    }

    public static zz5R zzY1(int i, int i2) {
        if (i != 2) {
            if (i != 9) {
                if (i != 11) {
                    if (i != 16) {
                        if (i != 19) {
                            if (i != 24) {
                                if (i != 32) {
                                    if (i == 61) {
                                        if (i2 == 9) {
                                            return new zz5P(true);
                                        }
                                        if (i2 == 19) {
                                            return new zz5M(true);
                                        }
                                        if (i2 == 24) {
                                            return new zz5L(true);
                                        }
                                    }
                                } else {
                                    if (i2 == 2) {
                                        return new zz5N(false);
                                    }
                                    if (i2 == 11) {
                                        return new zz5O(false);
                                    }
                                    if (i2 == 16) {
                                        return new zz5M(false);
                                    }
                                }
                            } else {
                                if (i2 == 9) {
                                    return new zz5Q(true);
                                }
                                if (i2 == 19) {
                                    return new zz5N(true);
                                }
                                if (i2 == 61) {
                                    return new zz5L(false);
                                }
                            }
                        } else {
                            if (i2 == 9) {
                                return new zz5O(false);
                            }
                            if (i2 == 24) {
                                return new zz5N(false);
                            }
                            if (i2 == 61) {
                                return new zz5M(false);
                            }
                        }
                    } else {
                        if (i2 == 2) {
                            return new zz5L(true);
                        }
                        if (i2 == 11) {
                            return new zz5P(true);
                        }
                        if (i2 == 32) {
                            return new zz5M(true);
                        }
                    }
                } else {
                    if (i2 == 2) {
                        return new zz5Q(false);
                    }
                    if (i2 == 16) {
                        return new zz5P(false);
                    }
                    if (i2 == 32) {
                        return new zz5O(true);
                    }
                }
            } else {
                if (i2 == 19) {
                    return new zz5O(true);
                }
                if (i2 == 24) {
                    return new zz5Q(false);
                }
                if (i2 == 61) {
                    return new zz5P(false);
                }
            }
        } else {
            if (i2 == 11) {
                return new zz5Q(true);
            }
            if (i2 == 16) {
                return new zz5L(false);
            }
            if (i2 == 32) {
                return new zz5N(true);
            }
        }
        return new zz5M(false);
    }

    public abstract float zzk(float f, float f2);

    public abstract float zzl(float f, float f2);

    public abstract float zzm(float f, float f2);

    public abstract float zzn(float f, float f2);

    public final float zzo(float f, float f2) {
        return this.zzZ1I ? zzk(f2, f) : zzk(f, f2);
    }

    public final float zzp(float f, float f2) {
        return this.zzZ1I ? zzl(f2, f) : zzl(f, f2);
    }

    public final float zzq(float f, float f2) {
        return this.zzZ1I ? zzm(f2, f) : zzm(f, f2);
    }

    public final float zzr(float f, float f2) {
        return this.zzZ1I ? zzn(f2, f) : zzn(f, f2);
    }
}
