// Log wrapper class for Sun private system exceptions in group UTIL
//
// Generated by mc.scm version %I%, DO NOT EDIT BY HAND!
// Generated from input file ../../../../src/share/classes/com/sun/corba/se/spi/logging/data/Util.mc on Fri Jan 20 10:36:36 PST 2012

package com.sun.corba.se.impl.logging ;

import java.util.logging.Logger ;
import java.util.logging.Level ;

import org.omg.CORBA.OMGVMCID ;
import com.sun.corba.se.impl.util.SUNVMCID ;
import org.omg.CORBA.CompletionStatus ;
import org.omg.CORBA.SystemException ;

import com.sun.corba.se.spi.orb.ORB ;

import com.sun.corba.se.spi.logging.LogWrapperFactory;

import com.sun.corba.se.spi.logging.LogWrapperBase;

import org.omg.CORBA.BAD_OPERATION ;
import org.omg.CORBA.BAD_PARAM ;
import org.omg.CORBA.DATA_CONVERSION ;
import org.omg.CORBA.MARSHAL ;
import org.omg.CORBA.INV_OBJREF ;
import org.omg.CORBA.INTERNAL ;
import org.omg.CORBA.UNKNOWN ;

public class UtilSystemException extends LogWrapperBase {
    
    public UtilSystemException( Logger logger )
    {
        super( logger ) ;
    }
    
    private static LogWrapperFactory factory = new LogWrapperFactory() {
        public LogWrapperBase create( Logger logger )
        {
            return new UtilSystemException( logger ) ;
        }
    } ;
    
    public static UtilSystemException get( ORB orb, String logDomain )
    {
        UtilSystemException wrapper = 
            (UtilSystemException) orb.getLogWrapper( logDomain, 
                "UTIL", factory ) ;
        return wrapper ;
    } 
    
    public static UtilSystemException get( String logDomain )
    {
        UtilSystemException wrapper = 
            (UtilSystemException) ORB.staticGetLogWrapper( logDomain, 
                "UTIL", factory ) ;
        return wrapper ;
    } 
    
    ///////////////////////////////////////////////////////////
    // BAD_OPERATION
    ///////////////////////////////////////////////////////////
    
    public static final int STUB_FACTORY_COULD_NOT_MAKE_STUB = SUNVMCID.value + 1401 ;
    
    public BAD_OPERATION stubFactoryCouldNotMakeStub( CompletionStatus cs, Throwable t ) {
        BAD_OPERATION exc = new BAD_OPERATION( STUB_FACTORY_COULD_NOT_MAKE_STUB, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.FINE )) {
            Object[] parameters = null ;
            doLog( Level.FINE, "UTIL.stubFactoryCouldNotMakeStub",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_OPERATION stubFactoryCouldNotMakeStub( CompletionStatus cs ) {
        return stubFactoryCouldNotMakeStub( cs, null  ) ;
    }
    
    public BAD_OPERATION stubFactoryCouldNotMakeStub( Throwable t ) {
        return stubFactoryCouldNotMakeStub( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_OPERATION stubFactoryCouldNotMakeStub(  ) {
        return stubFactoryCouldNotMakeStub( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int ERROR_IN_MAKE_STUB_FROM_REPOSITORY_ID = SUNVMCID.value + 1402 ;
    
    public BAD_OPERATION errorInMakeStubFromRepositoryId( CompletionStatus cs, Throwable t ) {
        BAD_OPERATION exc = new BAD_OPERATION( ERROR_IN_MAKE_STUB_FROM_REPOSITORY_ID, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.FINE )) {
            Object[] parameters = null ;
            doLog( Level.FINE, "UTIL.errorInMakeStubFromRepositoryId",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_OPERATION errorInMakeStubFromRepositoryId( CompletionStatus cs ) {
        return errorInMakeStubFromRepositoryId( cs, null  ) ;
    }
    
    public BAD_OPERATION errorInMakeStubFromRepositoryId( Throwable t ) {
        return errorInMakeStubFromRepositoryId( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_OPERATION errorInMakeStubFromRepositoryId(  ) {
        return errorInMakeStubFromRepositoryId( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int CLASS_CAST_EXCEPTION_IN_LOAD_STUB = SUNVMCID.value + 1403 ;
    
    public BAD_OPERATION classCastExceptionInLoadStub( CompletionStatus cs, Throwable t ) {
        BAD_OPERATION exc = new BAD_OPERATION( CLASS_CAST_EXCEPTION_IN_LOAD_STUB, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.FINE )) {
            Object[] parameters = null ;
            doLog( Level.FINE, "UTIL.classCastExceptionInLoadStub",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_OPERATION classCastExceptionInLoadStub( CompletionStatus cs ) {
        return classCastExceptionInLoadStub( cs, null  ) ;
    }
    
    public BAD_OPERATION classCastExceptionInLoadStub( Throwable t ) {
        return classCastExceptionInLoadStub( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_OPERATION classCastExceptionInLoadStub(  ) {
        return classCastExceptionInLoadStub( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int EXCEPTION_IN_LOAD_STUB = SUNVMCID.value + 1404 ;
    
    public BAD_OPERATION exceptionInLoadStub( CompletionStatus cs, Throwable t ) {
        BAD_OPERATION exc = new BAD_OPERATION( EXCEPTION_IN_LOAD_STUB, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.FINE )) {
            Object[] parameters = null ;
            doLog( Level.FINE, "UTIL.exceptionInLoadStub",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_OPERATION exceptionInLoadStub( CompletionStatus cs ) {
        return exceptionInLoadStub( cs, null  ) ;
    }
    
    public BAD_OPERATION exceptionInLoadStub( Throwable t ) {
        return exceptionInLoadStub( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_OPERATION exceptionInLoadStub(  ) {
        return exceptionInLoadStub( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // BAD_PARAM
    ///////////////////////////////////////////////////////////
    
    public static final int NO_POA = SUNVMCID.value + 1402 ;
    
    public BAD_PARAM noPoa( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( NO_POA, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "UTIL.noPoa",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM noPoa( CompletionStatus cs ) {
        return noPoa( cs, null  ) ;
    }
    
    public BAD_PARAM noPoa( Throwable t ) {
        return noPoa( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM noPoa(  ) {
        return noPoa( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int CONNECT_WRONG_ORB = SUNVMCID.value + 1403 ;
    
    public BAD_PARAM connectWrongOrb( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( CONNECT_WRONG_ORB, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.FINE )) {
            Object[] parameters = null ;
            doLog( Level.FINE, "UTIL.connectWrongOrb",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM connectWrongOrb( CompletionStatus cs ) {
        return connectWrongOrb( cs, null  ) ;
    }
    
    public BAD_PARAM connectWrongOrb( Throwable t ) {
        return connectWrongOrb( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM connectWrongOrb(  ) {
        return connectWrongOrb( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int CONNECT_NO_TIE = SUNVMCID.value + 1404 ;
    
    public BAD_PARAM connectNoTie( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( CONNECT_NO_TIE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "UTIL.connectNoTie",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM connectNoTie( CompletionStatus cs ) {
        return connectNoTie( cs, null  ) ;
    }
    
    public BAD_PARAM connectNoTie( Throwable t ) {
        return connectNoTie( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM connectNoTie(  ) {
        return connectNoTie( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int CONNECT_TIE_WRONG_ORB = SUNVMCID.value + 1405 ;
    
    public BAD_PARAM connectTieWrongOrb( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( CONNECT_TIE_WRONG_ORB, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "UTIL.connectTieWrongOrb",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM connectTieWrongOrb( CompletionStatus cs ) {
        return connectTieWrongOrb( cs, null  ) ;
    }
    
    public BAD_PARAM connectTieWrongOrb( Throwable t ) {
        return connectTieWrongOrb( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM connectTieWrongOrb(  ) {
        return connectTieWrongOrb( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int CONNECT_TIE_NO_SERVANT = SUNVMCID.value + 1406 ;
    
    public BAD_PARAM connectTieNoServant( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( CONNECT_TIE_NO_SERVANT, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "UTIL.connectTieNoServant",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM connectTieNoServant( CompletionStatus cs ) {
        return connectTieNoServant( cs, null  ) ;
    }
    
    public BAD_PARAM connectTieNoServant( Throwable t ) {
        return connectTieNoServant( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM connectTieNoServant(  ) {
        return connectTieNoServant( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int LOAD_TIE_FAILED = SUNVMCID.value + 1407 ;
    
    public BAD_PARAM loadTieFailed( CompletionStatus cs, Throwable t, Object arg0) {
        BAD_PARAM exc = new BAD_PARAM( LOAD_TIE_FAILED, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.FINE )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.FINE, "UTIL.loadTieFailed",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM loadTieFailed( CompletionStatus cs, Object arg0) {
        return loadTieFailed( cs, null, arg0 ) ;
    }
    
    public BAD_PARAM loadTieFailed( Throwable t, Object arg0) {
        return loadTieFailed( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public BAD_PARAM loadTieFailed(  Object arg0) {
        return loadTieFailed( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // DATA_CONVERSION
    ///////////////////////////////////////////////////////////
    
    public static final int BAD_HEX_DIGIT = SUNVMCID.value + 1401 ;
    
    public DATA_CONVERSION badHexDigit( CompletionStatus cs, Throwable t ) {
        DATA_CONVERSION exc = new DATA_CONVERSION( BAD_HEX_DIGIT, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "UTIL.badHexDigit",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public DATA_CONVERSION badHexDigit( CompletionStatus cs ) {
        return badHexDigit( cs, null  ) ;
    }
    
    public DATA_CONVERSION badHexDigit( Throwable t ) {
        return badHexDigit( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public DATA_CONVERSION badHexDigit(  ) {
        return badHexDigit( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // MARSHAL
    ///////////////////////////////////////////////////////////
    
    public static final int UNABLE_LOCATE_VALUE_HELPER = SUNVMCID.value + 1402 ;
    
    public MARSHAL unableLocateValueHelper( CompletionStatus cs, Throwable t ) {
        MARSHAL exc = new MARSHAL( UNABLE_LOCATE_VALUE_HELPER, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "UTIL.unableLocateValueHelper",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public MARSHAL unableLocateValueHelper( CompletionStatus cs ) {
        return unableLocateValueHelper( cs, null  ) ;
    }
    
    public MARSHAL unableLocateValueHelper( Throwable t ) {
        return unableLocateValueHelper( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public MARSHAL unableLocateValueHelper(  ) {
        return unableLocateValueHelper( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int INVALID_INDIRECTION = SUNVMCID.value + 1403 ;
    
    public MARSHAL invalidIndirection( CompletionStatus cs, Throwable t, Object arg0) {
        MARSHAL exc = new MARSHAL( INVALID_INDIRECTION, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.WARNING, "UTIL.invalidIndirection",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public MARSHAL invalidIndirection( CompletionStatus cs, Object arg0) {
        return invalidIndirection( cs, null, arg0 ) ;
    }
    
    public MARSHAL invalidIndirection( Throwable t, Object arg0) {
        return invalidIndirection( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public MARSHAL invalidIndirection(  Object arg0) {
        return invalidIndirection( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // INV_OBJREF
    ///////////////////////////////////////////////////////////
    
    public static final int OBJECT_NOT_CONNECTED = SUNVMCID.value + 1401 ;
    
    public INV_OBJREF objectNotConnected( CompletionStatus cs, Throwable t, Object arg0) {
        INV_OBJREF exc = new INV_OBJREF( OBJECT_NOT_CONNECTED, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.WARNING, "UTIL.objectNotConnected",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INV_OBJREF objectNotConnected( CompletionStatus cs, Object arg0) {
        return objectNotConnected( cs, null, arg0 ) ;
    }
    
    public INV_OBJREF objectNotConnected( Throwable t, Object arg0) {
        return objectNotConnected( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public INV_OBJREF objectNotConnected(  Object arg0) {
        return objectNotConnected( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    public static final int COULD_NOT_LOAD_STUB = SUNVMCID.value + 1402 ;
    
    public INV_OBJREF couldNotLoadStub( CompletionStatus cs, Throwable t, Object arg0) {
        INV_OBJREF exc = new INV_OBJREF( COULD_NOT_LOAD_STUB, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.WARNING, "UTIL.couldNotLoadStub",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INV_OBJREF couldNotLoadStub( CompletionStatus cs, Object arg0) {
        return couldNotLoadStub( cs, null, arg0 ) ;
    }
    
    public INV_OBJREF couldNotLoadStub( Throwable t, Object arg0) {
        return couldNotLoadStub( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public INV_OBJREF couldNotLoadStub(  Object arg0) {
        return couldNotLoadStub( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    public static final int OBJECT_NOT_EXPORTED = SUNVMCID.value + 1403 ;
    
    public INV_OBJREF objectNotExported( CompletionStatus cs, Throwable t, Object arg0) {
        INV_OBJREF exc = new INV_OBJREF( OBJECT_NOT_EXPORTED, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.WARNING, "UTIL.objectNotExported",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INV_OBJREF objectNotExported( CompletionStatus cs, Object arg0) {
        return objectNotExported( cs, null, arg0 ) ;
    }
    
    public INV_OBJREF objectNotExported( Throwable t, Object arg0) {
        return objectNotExported( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public INV_OBJREF objectNotExported(  Object arg0) {
        return objectNotExported( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // INTERNAL
    ///////////////////////////////////////////////////////////
    
    public static final int ERROR_SET_OBJECT_FIELD = SUNVMCID.value + 1401 ;
    
    public INTERNAL errorSetObjectField( CompletionStatus cs, Throwable t, Object arg0, Object arg1, Object arg2) {
        INTERNAL exc = new INTERNAL( ERROR_SET_OBJECT_FIELD, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[3] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            parameters[2] = arg2 ;
            doLog( Level.WARNING, "UTIL.errorSetObjectField",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL errorSetObjectField( CompletionStatus cs, Object arg0, Object arg1, Object arg2) {
        return errorSetObjectField( cs, null, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetObjectField( Throwable t, Object arg0, Object arg1, Object arg2) {
        return errorSetObjectField( CompletionStatus.COMPLETED_NO, t, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetObjectField(  Object arg0, Object arg1, Object arg2) {
        return errorSetObjectField( CompletionStatus.COMPLETED_NO, null, arg0, arg1, arg2 ) ;
    }
    
    public static final int ERROR_SET_BOOLEAN_FIELD = SUNVMCID.value + 1402 ;
    
    public INTERNAL errorSetBooleanField( CompletionStatus cs, Throwable t, Object arg0, Object arg1, Object arg2) {
        INTERNAL exc = new INTERNAL( ERROR_SET_BOOLEAN_FIELD, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[3] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            parameters[2] = arg2 ;
            doLog( Level.WARNING, "UTIL.errorSetBooleanField",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL errorSetBooleanField( CompletionStatus cs, Object arg0, Object arg1, Object arg2) {
        return errorSetBooleanField( cs, null, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetBooleanField( Throwable t, Object arg0, Object arg1, Object arg2) {
        return errorSetBooleanField( CompletionStatus.COMPLETED_NO, t, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetBooleanField(  Object arg0, Object arg1, Object arg2) {
        return errorSetBooleanField( CompletionStatus.COMPLETED_NO, null, arg0, arg1, arg2 ) ;
    }
    
    public static final int ERROR_SET_BYTE_FIELD = SUNVMCID.value + 1403 ;
    
    public INTERNAL errorSetByteField( CompletionStatus cs, Throwable t, Object arg0, Object arg1, Object arg2) {
        INTERNAL exc = new INTERNAL( ERROR_SET_BYTE_FIELD, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[3] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            parameters[2] = arg2 ;
            doLog( Level.WARNING, "UTIL.errorSetByteField",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL errorSetByteField( CompletionStatus cs, Object arg0, Object arg1, Object arg2) {
        return errorSetByteField( cs, null, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetByteField( Throwable t, Object arg0, Object arg1, Object arg2) {
        return errorSetByteField( CompletionStatus.COMPLETED_NO, t, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetByteField(  Object arg0, Object arg1, Object arg2) {
        return errorSetByteField( CompletionStatus.COMPLETED_NO, null, arg0, arg1, arg2 ) ;
    }
    
    public static final int ERROR_SET_CHAR_FIELD = SUNVMCID.value + 1404 ;
    
    public INTERNAL errorSetCharField( CompletionStatus cs, Throwable t, Object arg0, Object arg1, Object arg2) {
        INTERNAL exc = new INTERNAL( ERROR_SET_CHAR_FIELD, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[3] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            parameters[2] = arg2 ;
            doLog( Level.WARNING, "UTIL.errorSetCharField",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL errorSetCharField( CompletionStatus cs, Object arg0, Object arg1, Object arg2) {
        return errorSetCharField( cs, null, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetCharField( Throwable t, Object arg0, Object arg1, Object arg2) {
        return errorSetCharField( CompletionStatus.COMPLETED_NO, t, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetCharField(  Object arg0, Object arg1, Object arg2) {
        return errorSetCharField( CompletionStatus.COMPLETED_NO, null, arg0, arg1, arg2 ) ;
    }
    
    public static final int ERROR_SET_SHORT_FIELD = SUNVMCID.value + 1405 ;
    
    public INTERNAL errorSetShortField( CompletionStatus cs, Throwable t, Object arg0, Object arg1, Object arg2) {
        INTERNAL exc = new INTERNAL( ERROR_SET_SHORT_FIELD, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[3] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            parameters[2] = arg2 ;
            doLog( Level.WARNING, "UTIL.errorSetShortField",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL errorSetShortField( CompletionStatus cs, Object arg0, Object arg1, Object arg2) {
        return errorSetShortField( cs, null, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetShortField( Throwable t, Object arg0, Object arg1, Object arg2) {
        return errorSetShortField( CompletionStatus.COMPLETED_NO, t, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetShortField(  Object arg0, Object arg1, Object arg2) {
        return errorSetShortField( CompletionStatus.COMPLETED_NO, null, arg0, arg1, arg2 ) ;
    }
    
    public static final int ERROR_SET_INT_FIELD = SUNVMCID.value + 1406 ;
    
    public INTERNAL errorSetIntField( CompletionStatus cs, Throwable t, Object arg0, Object arg1, Object arg2) {
        INTERNAL exc = new INTERNAL( ERROR_SET_INT_FIELD, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[3] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            parameters[2] = arg2 ;
            doLog( Level.WARNING, "UTIL.errorSetIntField",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL errorSetIntField( CompletionStatus cs, Object arg0, Object arg1, Object arg2) {
        return errorSetIntField( cs, null, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetIntField( Throwable t, Object arg0, Object arg1, Object arg2) {
        return errorSetIntField( CompletionStatus.COMPLETED_NO, t, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetIntField(  Object arg0, Object arg1, Object arg2) {
        return errorSetIntField( CompletionStatus.COMPLETED_NO, null, arg0, arg1, arg2 ) ;
    }
    
    public static final int ERROR_SET_LONG_FIELD = SUNVMCID.value + 1407 ;
    
    public INTERNAL errorSetLongField( CompletionStatus cs, Throwable t, Object arg0, Object arg1, Object arg2) {
        INTERNAL exc = new INTERNAL( ERROR_SET_LONG_FIELD, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[3] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            parameters[2] = arg2 ;
            doLog( Level.WARNING, "UTIL.errorSetLongField",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL errorSetLongField( CompletionStatus cs, Object arg0, Object arg1, Object arg2) {
        return errorSetLongField( cs, null, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetLongField( Throwable t, Object arg0, Object arg1, Object arg2) {
        return errorSetLongField( CompletionStatus.COMPLETED_NO, t, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetLongField(  Object arg0, Object arg1, Object arg2) {
        return errorSetLongField( CompletionStatus.COMPLETED_NO, null, arg0, arg1, arg2 ) ;
    }
    
    public static final int ERROR_SET_FLOAT_FIELD = SUNVMCID.value + 1408 ;
    
    public INTERNAL errorSetFloatField( CompletionStatus cs, Throwable t, Object arg0, Object arg1, Object arg2) {
        INTERNAL exc = new INTERNAL( ERROR_SET_FLOAT_FIELD, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[3] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            parameters[2] = arg2 ;
            doLog( Level.WARNING, "UTIL.errorSetFloatField",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL errorSetFloatField( CompletionStatus cs, Object arg0, Object arg1, Object arg2) {
        return errorSetFloatField( cs, null, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetFloatField( Throwable t, Object arg0, Object arg1, Object arg2) {
        return errorSetFloatField( CompletionStatus.COMPLETED_NO, t, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetFloatField(  Object arg0, Object arg1, Object arg2) {
        return errorSetFloatField( CompletionStatus.COMPLETED_NO, null, arg0, arg1, arg2 ) ;
    }
    
    public static final int ERROR_SET_DOUBLE_FIELD = SUNVMCID.value + 1409 ;
    
    public INTERNAL errorSetDoubleField( CompletionStatus cs, Throwable t, Object arg0, Object arg1, Object arg2) {
        INTERNAL exc = new INTERNAL( ERROR_SET_DOUBLE_FIELD, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[3] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            parameters[2] = arg2 ;
            doLog( Level.WARNING, "UTIL.errorSetDoubleField",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL errorSetDoubleField( CompletionStatus cs, Object arg0, Object arg1, Object arg2) {
        return errorSetDoubleField( cs, null, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetDoubleField( Throwable t, Object arg0, Object arg1, Object arg2) {
        return errorSetDoubleField( CompletionStatus.COMPLETED_NO, t, arg0, arg1, arg2 ) ;
    }
    
    public INTERNAL errorSetDoubleField(  Object arg0, Object arg1, Object arg2) {
        return errorSetDoubleField( CompletionStatus.COMPLETED_NO, null, arg0, arg1, arg2 ) ;
    }
    
    public static final int ILLEGAL_FIELD_ACCESS = SUNVMCID.value + 1410 ;
    
    public INTERNAL illegalFieldAccess( CompletionStatus cs, Throwable t, Object arg0) {
        INTERNAL exc = new INTERNAL( ILLEGAL_FIELD_ACCESS, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.WARNING, "UTIL.illegalFieldAccess",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL illegalFieldAccess( CompletionStatus cs, Object arg0) {
        return illegalFieldAccess( cs, null, arg0 ) ;
    }
    
    public INTERNAL illegalFieldAccess( Throwable t, Object arg0) {
        return illegalFieldAccess( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public INTERNAL illegalFieldAccess(  Object arg0) {
        return illegalFieldAccess( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    public static final int BAD_BEGIN_UNMARSHAL_CUSTOM_VALUE = SUNVMCID.value + 1411 ;
    
    public INTERNAL badBeginUnmarshalCustomValue( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( BAD_BEGIN_UNMARSHAL_CUSTOM_VALUE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "UTIL.badBeginUnmarshalCustomValue",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL badBeginUnmarshalCustomValue( CompletionStatus cs ) {
        return badBeginUnmarshalCustomValue( cs, null  ) ;
    }
    
    public INTERNAL badBeginUnmarshalCustomValue( Throwable t ) {
        return badBeginUnmarshalCustomValue( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL badBeginUnmarshalCustomValue(  ) {
        return badBeginUnmarshalCustomValue( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int CLASS_NOT_FOUND = SUNVMCID.value + 1412 ;
    
    public INTERNAL classNotFound( CompletionStatus cs, Throwable t, Object arg0) {
        INTERNAL exc = new INTERNAL( CLASS_NOT_FOUND, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.WARNING, "UTIL.classNotFound",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL classNotFound( CompletionStatus cs, Object arg0) {
        return classNotFound( cs, null, arg0 ) ;
    }
    
    public INTERNAL classNotFound( Throwable t, Object arg0) {
        return classNotFound( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public INTERNAL classNotFound(  Object arg0) {
        return classNotFound( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // UNKNOWN
    ///////////////////////////////////////////////////////////
    
    public static final int UNKNOWN_SYSEX = SUNVMCID.value + 1401 ;
    
    public UNKNOWN unknownSysex( CompletionStatus cs, Throwable t ) {
        UNKNOWN exc = new UNKNOWN( UNKNOWN_SYSEX, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "UTIL.unknownSysex",
                parameters, UtilSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public UNKNOWN unknownSysex( CompletionStatus cs ) {
        return unknownSysex( cs, null  ) ;
    }
    
    public UNKNOWN unknownSysex( Throwable t ) {
        return unknownSysex( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public UNKNOWN unknownSysex(  ) {
        return unknownSysex( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    
}
