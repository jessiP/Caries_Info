package com.unbosque.info.service;

import java.util.List;

import com.unbosque.info.dao.UsuarioDAO;
import com.unbosque.info.entidad.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("UsuarioService")
@Transactional(readOnly = true)
public class UsuarioService {

	// DepartamentoDAO is injected...
	@Autowired
	UsuarioDAO usuarioDAO;

	@Transactional(readOnly = false)
	public void addUsuario(Usuario usuario) {
		getUsuarioDAO().addUsuario(usuario);
	}

	@Transactional(readOnly = false)
	public void deleteUsuario(Usuario usuario) {
		getUsuarioDAO().deleteUsuario(usuario);
	}

	@Transactional(readOnly = false)
	public void updateUsuario(Usuario usuario) {
		getUsuarioDAO().updateUsuario(usuario);
	}

	public Usuario getUsuarioById(int id) {
		return getUsuarioDAO().getUsuarioById(id);
	}

	public List<Usuario> getUsuarios() {
		return getUsuarioDAO().getUsuarios();
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setDepartamentoDAO(UsuarioDAO departamentoDAO) {
		this.usuarioDAO = usuarioDAO;
	}
}
