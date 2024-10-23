package aula13.PadariaV1;

public class Leite extends Produto {
	protected String tipoLeite; // (desnatado, integral) 
	protected String classificacaoLeite; // (A, B, C) 
	protected float percentualLactose;
	
	public Leite(String nome, float precoUnidade, String marca, 
			String tipoLeite, String classificacaoLeite,
			float percentualLactose) {
		super(nome, precoUnidade, marca);
		this.tipoLeite = tipoLeite;
		this.classificacaoLeite = classificacaoLeite;
		this.percentualLactose = percentualLactose;
	}
	
	public String getTipoLeite() {
		return tipoLeite;
	}

	public void setTipoLeite(String tipoLeite) {
		this.tipoLeite = tipoLeite;
	}

	public String getClassificacaoLeite() {
		return classificacaoLeite;
	}

	public void setClassificacaoLeite(String classificacaoLeite) {
		this.classificacaoLeite = classificacaoLeite;
	}

	public float getPercentualLactose() {
		return percentualLactose;
	}

	public void setPercentualLactose(float percentualLactose) {
		this.percentualLactose = percentualLactose;
	}

	public void descricao() {
		System.out.println(this.toString());
	}    
    public boolean contemLactose() {
    	if (percentualLactose > 0 ) {
    		return true;
    	}
    	return false;
    	// Forma alternativa mais direta
    	// return (percentualLactose > 0);
    }
	
	@Override
	public String toString() {
		return "Leite [tipoLeite=" + tipoLeite + ", classificacaoLeite=" + classificacaoLeite + ", percentualLactose="
				+ percentualLactose + ", nome=" + nome + ", precoUnidade=" + precoUnidade + ", marca=" + marca + "]";
	}

}
