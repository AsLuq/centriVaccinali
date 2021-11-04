package com.studenti.uninsubria.clientCV.model;

/**
 * @author luqmanasghar
 * @author Cristian Zuffellato
 */

public class CentroVaccinaleModel {

    // <editor-fold desc="Attributi">

    private int idCentroVaccinale;
    private String nome;
    private String via;
    private int numeroCivico;
    private String provincia;
    private String comune;
    private String cap;
    private TipologiaCentroVaccinaleModel tipologiaCentroVaccinaleModel;

    // </editor-fold>

    // <editor-fold desc="Costruttori">

    public CentroVaccinaleModel() {
    }

    public CentroVaccinaleModel(String nome, String via, int numeroCivico, String comune, String provincia,
                                String cap, TipologiaCentroVaccinaleModel tipologiaCentroVaccinaleModel) {
        this.nome = nome;
        this.via = via;
        this.numeroCivico = numeroCivico;
        this.comune = comune;
        this.provincia = provincia;
        this.cap = cap;
        this.tipologiaCentroVaccinaleModel = tipologiaCentroVaccinaleModel;
    }

    // </editor-fold>

    // <editor-fold desc="Getter & Setters">

    /**
     * Legge IdCentroVacinale
     * @return idCentroVaccinale
     */

    public int getIdCentroVaccinale() {
        return idCentroVaccinale;
    }

    /**
     * Assegna IdCentrovaccinale
     * @param idCentroVaccinale
     */

    public void setIdCentroVaccinale(int idCentroVaccinale) {
        this.idCentroVaccinale = idCentroVaccinale;
    }

    /**
     * Legge NomeCentroVaccinale
     * @return nome
     */

    public String getNome() {
        return nome;
    }

    /**
     * Assegna NomeCentroVaccinale
     * @param nome
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Legge Provincia
     * @return provincia
     */

    public String getProvincia() {
        return provincia;
    }

    /**
     * Assegna Provincia
     * @param provincia
     */

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Legge Comune
     * @return comune
     */

    public String getComune() {
        return comune;
    }

    /**
     * Assegna Comune
     * @param comune
     */

    public void setComune(String comune) {
        this.comune = comune;
    }

    /**
     * Legge Via
     * @return via
     */

    public String getVia() {
        return via;
    }

    /**
     * Assegna Via
     * @param via
     */

    public void setVia(String via) {
        this.via = via;
    }

    /**
     * Legge Cap
     * @return cap
     */

    public String getCap() {
        return cap;
    }

    /**
     * Assegna Cap
     * @param cap
     */

    public void setCap(String cap) {
        this.cap = cap;
    }

    /**
     * Legge TipologiaCentroVaccinale
     * @return tipologiaCentroVaccinaleModel
     */

    public TipologiaCentroVaccinaleModel getTipologiaCentroVaccinaleModel() {
        return tipologiaCentroVaccinaleModel;
    }

    /**
     * Assegna TipologiaCentroVaccinale
     * @param tipologiaCentroVaccinaleModel
     */

    public void setTipologiaCentroVaccinaleModel(TipologiaCentroVaccinaleModel tipologiaCentroVaccinaleModel) {
        this.tipologiaCentroVaccinaleModel = tipologiaCentroVaccinaleModel;
    }

    /**
     * Legge NumeroCivico
     * @return numeroCivico
     */

    public int getNumeroCivico() {
        return numeroCivico;
    }

    /**
     * Assegna NumeroCivico
     * @param numeroCivico
     */

    public void setNumeroCivico(int numeroCivico) {
        this.numeroCivico = numeroCivico;
    }

// </editor-fold>

    // <editor-fold desc="Altri metodi">

    /**
     * Creates and returns a copy of this object. The precise meaning of "copy" may
     * depend on the class of the object. The general intent is that, for any object
     * {@code x}, the expression: <blockquote>
     * 
     * <pre>
     * x.clone() != x
     * </pre>
     * 
     * </blockquote> will be true, and that the expression: <blockquote>
     * 
     * <pre>
     * x.clone().getClass() == x.getClass()
     * </pre>
     * 
     * </blockquote> will be {@code true}, but these are not absolute requirements.
     * While it is typically the case that: <blockquote>
     * 
     * <pre>
     * x.clone().equals(x)
     * </pre>
     * 
     * </blockquote> will be {@code true}, this is not an absolute requirement.
     * <p>
     * By convention, the returned object should be obtained by calling
     * {@code super.clone}. If a class and all of its superclasses (except
     * {@code Object}) obey this convention, it will be the case that
     * {@code x.clone().getClass() == x.getClass()}.
     * <p>
     * By convention, the object returned by this method should be independent of
     * this object (which is being cloned). To achieve this independence, it may be
     * necessary to modify one or more fields of the object returned by
     * {@code super.clone} before returning it. Typically, this means copying any
     * mutable objects that comprise the internal "deep structure" of the object
     * being cloned and replacing the references to these objects with references to
     * the copies. If a class contains only primitive fields or references to
     * immutable objects, then it is usually the case that no fields in the object
     * returned by {@code super.clone} need to be modified.
     * <p>
     * The method {@code clone} for class {@code Object} performs a specific cloning
     * operation. First, if the class of this object does not implement the
     * interface {@code Cloneable}, then a {@code CloneNotSupportedException} is
     * thrown. Note that all arrays are considered to implement the interface
     * {@code Cloneable} and that the return type of the {@code clone} method of an
     * array type {@code T[]} is {@code T[]} where T is any reference or primitive
     * type. Otherwise, this method creates a new instance of the class of this
     * object and initializes all its fields with exactly the contents of the
     * corresponding fields of this object, as if by assignment; the contents of the
     * fields are not themselves cloned. Thus, this method performs a "shallow copy"
     * of this object, not a "deep copy" operation.
     * <p>
     * The class {@code Object} does not itself implement the interface
     * {@code Cloneable}, so calling the {@code clone} method on an object whose
     * class is {@code Object} will result in throwing an exception at run time.
     *
     * @return a clone of this instance.
     * @throws CloneNotSupportedException if the object's class does not support the
     *                                    {@code Cloneable} interface. Subclasses
     *                                    that override the {@code clone} method can
     *                                    also throw this exception to indicate that
     *                                    an instance cannot be cloned.
     * @see Cloneable
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CentroVaccinaleModel{" + "idCentroVaccinale=" + idCentroVaccinale + ", nome='" + nome + '\''
                + ", provincia='" + provincia + '\'' + ", comune='" + comune + '\'' + ", via='" + via + '\'' + ", cap='"
                + cap + '\'' + '}';
    }

    // </editor-fold>

}
