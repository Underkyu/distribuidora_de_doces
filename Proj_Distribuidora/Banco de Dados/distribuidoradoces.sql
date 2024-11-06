-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 06-Nov-2024 às 19:18
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `distribuidoradoces`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int(10) NOT NULL,
  `nome_categoria` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `nome_categoria`) VALUES
(1, 'Jujubas'),
(2, 'Chicletes'),
(3, 'Doces de Frutas'),
(4, 'Balas'),
(5, 'Pirulitos');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(10) NOT NULL,
  `cpf_cliente` varchar(14) NOT NULL,
  `nome_cliente` varchar(50) NOT NULL,
  `telefone_cliente` varchar(15) NOT NULL,
  `endereco_cliente` varchar(150) NOT NULL,
  `data_nasc` date NOT NULL,
  `status_cliente` varchar(255) DEFAULT 'ativo',
  `senha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `cpf_cliente`, `nome_cliente`, `telefone_cliente`, `endereco_cliente`, `data_nasc`, `status_cliente`, `senha`) VALUES
(1, '431.758.468-70', 'José da Silva', '(11)97633-5478', 'Rua Cabo C, n° 6', '2003-07-23', 'Ótimo', '123'),
(2, '512.890.123-88', 'Maria de Souza', '(11)98765-4321', 'Avenida Brasil, n° 45', '1995-10-12', 'Regular', ''),
(3, '213.456.789-00', 'Carlos Pereira', '(21)99887-6543', 'Rua das Flores, n° 22', '1980-04-17', 'Excelente', ''),
(4, '987.654.321-55', 'Ana Costa', '(31)98777-1234', 'Praça da Liberdade, n° 101', '1990-12-25', 'Bom', ''),
(5, '356.633.685-89', 'Fabrícia Oliveira', '(11)45634-5604', 'Rua Cabo B, 239', '2006-03-06', 'Ruim', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `id_fornecedor` int(10) NOT NULL,
  `nome_fornecedor` varchar(50) NOT NULL,
  `endereco_fornecedor` varchar(150) DEFAULT NULL,
  `telefone_fornecedor` varchar(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id_fornecedor`, `nome_fornecedor`, `endereco_fornecedor`, `telefone_fornecedor`) VALUES
(1, '', 'Rua das Flores, 123, Centro', '(11)91234-5678'),
(2, '', 'Avenida Brasil, 456, Jardim', '(11)93456-7890'),
(3, '', 'Rua da Paz, 789, Bairro Novo', '(21)99876-5432'),
(4, '', 'Praça da Liberdade, 10', '(31)98765-4321'),
(5, '', 'Estrada do Sol, 50', '(41)97654-3210');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(10) NOT NULL,
  `id_cliente` int(10) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `valor_total` decimal(10,2) DEFAULT NULL,
  `status_pedido` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pedido`
--

INSERT INTO `pedido` (`id_pedido`, `id_cliente`, `data`, `valor_total`, `status_pedido`) VALUES
(1, 1, '2024-10-01', '200.50', 'Concluído'),
(2, 2, '2024-10-02', '350.00', 'Pendente'),
(3, 3, '2024-09-29', '150.99', 'Em processamento'),
(4, 4, '2024-10-03', '450.75', 'Concluído'),
(5, 1, '2024-10-01', '200.50', 'Concluído');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id_produto` int(10) NOT NULL,
  `id_fornecedor` int(10) DEFAULT NULL,
  `id_categoria` int(10) DEFAULT NULL,
  `nome_produto` varchar(50) DEFAULT NULL,
  `valor_unitario` decimal(10,2) DEFAULT NULL,
  `quantidade_estoque` int(5) DEFAULT NULL,
  `quantidade_minima` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id_produto`, `id_fornecedor`, `id_categoria`, `nome_produto`, `valor_unitario`, `quantidade_estoque`, `quantidade_minima`) VALUES
(1, 1, 1, 'Jujubas Delli', '3500.00', 50, 10),
(2, 2, 2, 'Plutonita Baba de Bruxa', '1200.00', 150, 20),
(3, 3, 2, 'Plutonita Cérebro de Zumbi', '800.00', 30, 5),
(4, 1, 3, 'Doce de Abóbora', '950.00', 75, 15),
(5, 4, 4, 'Bala de Yogurt', '450.00', 20, 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto_vendido`
--

CREATE TABLE `produto_vendido` (
  `id_prod_vendido` int(10) NOT NULL,
  `id_pedido` int(10) DEFAULT NULL,
  `id_produto` int(10) DEFAULT NULL,
  `quantidade` int(5) DEFAULT NULL,
  `preco_final` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produto_vendido`
--

INSERT INTO `produto_vendido` (`id_prod_vendido`, `id_pedido`, `id_produto`, `quantidade`, `preco_final`) VALUES
(6, 1, 1, 2, '400.00'),
(7, 2, 2, 10, '250.00'),
(8, 3, 3, 3, '450.00'),
(9, 4, 4, 25, '500.00'),
(10, 5, 5, 145, '100.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `cpf` varchar(14) NOT NULL,
  `senha` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`cpf`, `senha`) VALUES
('123', '1234');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices para tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`);

--
-- Índices para tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_produto`),
  ADD KEY `id_fornecedor` (`id_fornecedor`),
  ADD KEY `id_categoria` (`id_categoria`);

--
-- Índices para tabela `produto_vendido`
--
ALTER TABLE `produto_vendido`
  ADD PRIMARY KEY (`id_prod_vendido`),
  ADD KEY `id_pedido` (`id_pedido`),
  ADD KEY `id_produto` (`id_produto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `id_fornecedor` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id_pedido` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id_produto` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `produto_vendido`
--
ALTER TABLE `produto_vendido`
  MODIFY `id_prod_vendido` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);

--
-- Limitadores para a tabela `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`id_fornecedor`) REFERENCES `fornecedor` (`id_fornecedor`),
  ADD CONSTRAINT `produto_ibfk_2` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`);

--
-- Limitadores para a tabela `produto_vendido`
--
ALTER TABLE `produto_vendido`
  ADD CONSTRAINT `produto_vendido_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`),
  ADD CONSTRAINT `produto_vendido_ibfk_2` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
